import java.util.LinkedList;
import java.util.Queue;

public class ColaAutoservicio {
    private Queue <Serivio>listaelemntos;

    public ColaAutoservicio() {
        listaelemntos=new LinkedList<Serivio>();

    }
    public void encolar(Serivio orden){
        listaelemntos.add(orden);
    }

    public void actualizar() throws Exception{
        if (listaelemntos.isEmpty()){
            throw new Exception("Sin elementos para actualizar");
        }
        listaelemntos.peek().setEstado(true);
    }
     public Serivio atender() throws Exception{
        if (listaelemntos.isEmpty()){
            throw new Exception("No hay elementos para atender");
         }
         return listaelemntos.poll();
     }

     public String listafila(){
         String texto="";
        for (Serivio aux : listaelemntos){
            texto+=aux.toString() + "\n";
        }
        return  texto;
     }

}
