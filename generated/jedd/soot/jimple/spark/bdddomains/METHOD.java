package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.jimple.spark.pag.*;
import soot.*;

public class METHOD extends Domain {
    public Numberer numberer() { return Scene.v().getMethodNumberer(); }
    
    public final int bits = 20;
    
    public static Domain v() { return instance; }
    
    private static Domain instance = new METHOD();
    
    public METHOD() { super(); }
}
