public class Problema1 {

    private String[] cadena (){
        String[] cadena = new String[20];
        return cadena;
    }
    public String[] numeros(){
        int contador = 0;

        for (int i = 0; i < cadena().length ; i++) {

            if(esMultiplo3(i) && esNumMultiplo5(i)){
                cadena()[i] = "FizzBuzz" ;
            }
            else if(esNumMultiplo5(i) && !esMultiplo3(i)){
                cadena()[i] = "Buzz";
            }
            else if(esMultiplo3(i) && !esNumMultiplo5(i)){
                cadena()[i] = "Fizz";
            }
            else{
                cadena()[i] = String.valueOf(contador);
            }
            contador ++;
        }
        return cadena();
    }
    private boolean esNumMultiplo5(Integer n){
        return n % 5 == 0;
    }
    private boolean esMultiplo3(Integer n){
        return n % 3 == 0;
    }
}
