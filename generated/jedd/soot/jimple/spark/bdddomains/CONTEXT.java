package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class CONTEXT extends Domain {
    public Numberer numberer() { return Scene.v().getContextNumberer(); }
    
    public final int bits = 20;
    
    public static Domain v() { return instance; }
    
    private static Domain instance = new CONTEXT();
    
    public CONTEXT() { super(); }
}
