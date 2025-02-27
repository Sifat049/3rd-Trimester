public class filedemo2 {
    public static void main(String[] args) {

        //Split Function
        String s1="a b c d e";
        String delay=" ";
        String[] parts=s1.split(delay);
        System.out.println(parts.length);
        for (String s:parts){
            System.out.println(s);
        }
        //Int/double/float to String
        int s2=5665;
        double s3=34.4553;
        float s4=23.2323f;

        String integer= s2 + "";
        String d= s3 +"";
        System.out.println(integer);
        System.out.println(d);
        System.out.println(String.valueOf(s4));

        //String to int /double/float
        String s5="5665";
        String s6="47.46478";
        try{
            System.out.println(Integer.parseInt(s6));

        }catch (NumberFormatException e){
            System.out.println(e);
        }
        System.out.println(Double.parseDouble(s6));

//String Equality Check
        String s7="Sifat";
        String s8="sifat";
        String s9="Sifatt";
        if(s8.equals(s7)){
            System.out.println("s8 eqauls s7");
        }
        if  (s9.contains(s7)){
            System.out.println("s9 contains s7.");
        }


    }
}
