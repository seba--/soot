package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Qlocal_srcm_stmt_signature_kindTrace extends Qlocal_srcm_stmt_signature_kindTrad {
    public Qlocal_srcm_stmt_signature_kindTrace(String name) {
        super();
        this.name = name;
    }
    
    private String name;
    
    public void add(Local _local, SootMethod _srcm, Unit _stmt, NumberedString _signature, Kind _kind) {
        System.out.print(name + ": ");
        System.out.print(_local + ", ");
        System.out.print(_srcm + ", ");
        System.out.print(_stmt + ", ");
        System.out.print(_signature + ", ");
        System.out.print(_kind + ", ");
        System.out.println();
        super.add(_local, _srcm, _stmt, _signature, _kind);
    }
}
