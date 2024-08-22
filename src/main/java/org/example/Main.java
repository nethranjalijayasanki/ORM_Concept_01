package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullAddress;
import org.example.embed.FullName;
import org.example.entity.Customer;
import org.example.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

//        customer value
        FullName customerFullName = new FullName("Nethranjali", "Jayasanki");
        FullAddress customerFullAddress = new FullAddress("Piyasewana", "Yatawa", "Kaluthara");

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName(customerFullName);
        customer.setAddress(customerFullAddress);
        customer.setTel("0741252528");

//        employee value
        FullName employeeFullName = new FullName("Nimsi", "Methusala");
        FullAddress employeeFullAddress = new FullAddress("Piyasewana", "Waulugala", "Panadura");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName(employeeFullName);
        employee.setAddress(employeeFullAddress);
        employee.setTel("0742581225");

        Transaction transaction = session.beginTransaction();
//      call customer
        session.save(customer);
        session.update(customer);
        session.delete(customer);
        Customer customer1 = session.get(Customer.class, 1);
        transaction.commit();

//      call employee
        session.save(employee);
        session.update(employee);
        session.delete(employee);
        session.get(String.valueOf(employee),employee);
        transaction.commit();

        session.close();
    }
}