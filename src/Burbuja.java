public class Burbuja
{
    public static void main(String[] args)
    {
      //Declaración de arreglo e impresión
       //int arr[] = {21,40,4,9,10,35};
        int arr[] = {6,22,11,16,27,3,5};
   
      System.out.println("\nARREGLO DESORDENADO");
      for (int dato: arr) {
     
         System.out.print("["+(dato)+"]");
                                           
        }
          
        System.out.println("");
      
        int arregloFinal[] = burbuja(arr);
 
        System.out.println("");
          
      //Impresión del arreglo ordendado
        System.out.println("\nARREGLO ORDENADO");
        for(int i = 0; i < arregloFinal.length;i++)
        System.out.print("["+arregloFinal[i]+"]");
        System.out.println("");
    }
     
    
    public static int[] burbuja(int[] arr) //Ordenamiento por el método burbuja
          
    {
      int aux;
    
      int[] arregloFinal;
      int paso = 0;
      for(int i = 1; i < arr.length; i++)
      {
        for(int j = 0;j < arr.length-i;j++)
        {
          if(arr[j] > arr[j+1])
          {
            paso = paso+1;  
            aux = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = aux;
        
                  
              System.out.println("\nPASO #"+paso); //Impresión del paso a paso del ordenamiento
                    
            for(int x = 0; x < arr.length;x++){
            System.out.print(arr[x]+"->");
            }
          
           }
        }
       }
      arregloFinal = arr;
      return arregloFinal;
    }
     
}