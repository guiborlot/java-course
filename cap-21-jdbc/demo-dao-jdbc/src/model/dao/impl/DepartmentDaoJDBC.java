package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
                    "INSERT INTO department " +
                            "(Name) " +
                            "VALUES " +
                            "(?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1 ,obj.getName());

            int rowsAffected = st.executeUpdate();
            if(rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()){
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                throw new DbException("Unexpected error: no rows affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void update(Department obj) {
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
                    "UPDATE department " +
                            "SET Name = ? " +
                            "WHERE Id = ?");

            st.setInt(2, obj.getId());
            st.setString(1, obj.getName());
            st.executeUpdate();
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st;

        try {
            st = conn.prepareStatement(
                    "DELETE FROM department " +
                            "WHERE Id = ?");

            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM department " +
                            "WHERE Id = ?"
            );

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();

            if(rs.next()){
                Department dep = new Department();
                dep.setId(rs.getInt("Id"));
                dep.setName(rs.getString("Name"));

                return dep;
            }
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
        return null;
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM department"
            );

            ResultSet rs = st.executeQuery();

            List<Department> departments = new ArrayList<>();

            while(rs.next()){
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                Department dep = new Department(id, name);

                departments.add(dep);
            }
            DB.closeResultSet(rs);
            return departments;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
}
