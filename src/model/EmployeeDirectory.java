/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author evelynzu
 */
public class EmployeeDirectory {

    private ArrayList<Employee> directory;

    public EmployeeDirectory() {
        Employee employee1 = new Employee("Evelyn Zu", "e002747633", 28, "female", "09/28/2020", 3, "human resource", "manager", "857-272-000", "evelyn_zu@gmail.com", "src/resource/images/EvelynZu002747633.png");
        Employee employee2 = new Employee("Charles Chen", "e122747295", 32, "male", "03/27/2020 ", 3, "support", "employee", "857-273-692", "charles_chen@gmail.com", "src/resource/images/CharlesChen1227472955.png");
        Employee employee3 = new Employee("Kyle Day", "e635924697", 52, "female", "09/01/2015", 1, "finance", "CFO", "818-933-6670", "kyleday11@gmail.com", "src/resource/images/KyleDay635924697.png");
        Employee employee4 = new Employee("Ruby Tenorio", "e826539022", 35, "female", "11/28/2019", 2, "support", "manager", "395-253-274", "rubytenorio583@gmail.com", "src/resource/images/RubyTenorio826539022.png");
        Employee employee5 = new Employee("MartinBradley", "e285634854", 53, "male", "01/01/2017", 1, "excutive team", "CEO", "826-275-7309", "martinbradley@gmail.com", "src/resource/images/MartinBradley285634854.png");

        this.directory = new ArrayList<Employee>();
        directory.add(employee1);
        directory.add(employee2);
        directory.add(employee3);
        directory.add(employee4);
        directory.add(employee5);

    }

    public ArrayList<Employee> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Employee> directory) {
        this.directory = directory;
    }

    public Employee addNewEmployee() {
        Employee newEmployee = new Employee();
        directory.add(newEmployee);
        return newEmployee;
    }

    public void deleteEmployee(Employee employee) {
        System.out.println(directory.indexOf(employee) + employee.getName() + "//" + employee + "//");
        directory.remove(employee);
    }

    public void editEmployee(Employee employee) {
        System.out.println(directory.indexOf(employee) + employee.getName() + "//" + employee + "//");
        directory.set(directory.indexOf(employee), employee);

    }
}
