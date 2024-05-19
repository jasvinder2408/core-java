package com.coding.java.corejava;

public class ShallowAndDeepCloning {

    public static void main(String [] args) throws CloneNotSupportedException {

        Address address = new Address("New Delhi", "Delhi", 1111);
        Employee employee1 = new Employee(101, "jasvinder", "xebia",address);

       Employee employee2 =(Employee) employee1.clone();

       employee2.getAddress().setCity("Bangalore");
       System.out.println(employee1);

       System.out.println(employee2);

    }

    public static class Employee implements Cloneable{
        private int empId;
        private String empName;
        private String company;
        private Address address;

        public Employee(int empId, String empName, String company, Address address) {
            this.empId = empId;
            this.empName = empName;
            this.company = company;
            this.address = address;
        }

        //override clone method to perform deep cloning

        @Override
        public Object clone ()throws CloneNotSupportedException{
           // for shallow cloning
         //   return super.clone();

            /**
             * For deep cloning
             */
            Employee employee =(Employee) super.clone();
            employee.setAddress((Address) address.clone());
            return employee;
        }


        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empId=" + empId +
                    ", empName='" + empName + '\'' +
                    ", company='" + company + '\'' +
                    ", address=" + address +
                    '}';
        }
    }

    public static class Address implements Cloneable{

        private String city;
        private String state;
        private int pinCode;

        public Address(String city, String state, int pinCode) {
            this.city = city;
            this.state = state;
            this.pinCode = pinCode;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getPinCode() {
            return pinCode;
        }

        public void setPinCode(int pinCode) {
            this.pinCode = pinCode;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", pinCode=" + pinCode +
                    '}';
        }
    }

}
