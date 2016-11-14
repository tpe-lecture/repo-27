package tpe.oo.metropolis;

public abstract class Einwohner extends Metropolis {

   protected String name;
   private double einkommen;

//   Einwohner(double einkommen) {
//       this.einkommen = einkommen;
//   }

   public double getEinkommen() {
       return this.einkommen;
   }
}
