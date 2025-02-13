public class patient {
    String name="";
    String address="";
    int age =0;
    String bloodgroup="";
    public static void main(String [] args){
        patient scan=new patient();
        scan.name="akash v";
        scan.address="chennai";
        scan.age=69;
        scan.bloodgroup="a+";

        patient scan1=new patient();
        scan1.name="logu";
        scan1.address="bombay";
        scan1.age=21;
        scan1.bloodgroup="b+"; 
        System.out.println(scan.name);
    }    
}
