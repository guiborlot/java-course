package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("=== TEST 1: department findById ===");
        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        Department department = departmentDao.findById(id);

        System.out.println(department);



        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department>list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        System.out.print("Name: ");
        String name = sc.next();

        Department newDepartment = new Department(null, name);
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment);

        System.out.println("\n=== TEST 4: department update ===");
        department = departmentDao.findById(1);
        department.setName("Cars");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: department delete ===");
        System.out.print("Enter id for delete test: ");
        id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");



        sc.close();
    }
}
