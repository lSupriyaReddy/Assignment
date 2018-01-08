package com.supriya.examples;

 class EncapsulationDemo {

	private int sn;
    private String empName;
    private int empAge;

    public int getEmpSN(){
        return sn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSN(int newValue){
        sn = newValue;
    }
}
  class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SN: " + obj.getEmpSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}

