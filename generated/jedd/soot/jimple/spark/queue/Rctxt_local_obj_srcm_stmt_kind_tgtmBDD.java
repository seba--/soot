package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Rctxt_local_obj_srcm_stmt_kind_tgtmBDD extends Rctxt_local_obj_srcm_stmt_kind_tgtm {
    private final jedd.internal.RelationContainer bdd =
      new jedd.internal.RelationContainer(new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() },
                                          new PhysicalDomain[] { V2.v(), V1.v(), H1.v(), T1.v(), ST.v(), FD.v(), T2.v() },
                                          ("private <soot.jimple.spark.bdddomains.ctxt:soot.jimple.spark" +
                                           ".bdddomains.V2, soot.jimple.spark.bdddomains.local:soot.jimp" +
                                           "le.spark.bdddomains.V1, soot.jimple.spark.bdddomains.obj:soo" +
                                           "t.jimple.spark.bdddomains.H1, soot.jimple.spark.bdddomains.s" +
                                           "rcm:soot.jimple.spark.bdddomains.T1, soot.jimple.spark.bdddo" +
                                           "mains.stmt:soot.jimple.spark.bdddomains.ST, soot.jimple.spar" +
                                           "k.bdddomains.kind:soot.jimple.spark.bdddomains.FD, soot.jimp" +
                                           "le.spark.bdddomains.tgtm:soot.jimple.spark.bdddomains.T2> bd" +
                                           "d = jedd.internal.Jedd.v().falseBDD() at /home/olhotak/soot-" +
                                           "2-jedd/src/soot/jimple/spark/queue/Rctxt_local_obj_srcm_stmt" +
                                           "_kind_tgtmBDD.jedd:31,12"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    void add(final jedd.internal.RelationContainer tuple) { bdd.eqUnion(tuple); }
    
    public Rctxt_local_obj_srcm_stmt_kind_tgtmBDD(final jedd.internal.RelationContainer bdd) {
        super();
        this.bdd.eq(bdd);
    }
    
    Rctxt_local_obj_srcm_stmt_kind_tgtmBDD() { super(); }
    
    public Iterator iterator() {
        ;
        final Iterator it =
          new jedd.internal.RelationContainer(new Attribute[] { obj.v(), ctxt.v(), tgtm.v(), local.v(), kind.v(), stmt.v(), srcm.v() },
                                              new PhysicalDomain[] { H1.v(), V2.v(), T2.v(), V1.v(), FD.v(), ST.v(), T1.v() },
                                              ("bdd.iterator(new jedd.Attribute[...]) at /home/olhotak/soot-" +
                                               "2-jedd/src/soot/jimple/spark/queue/Rctxt_local_obj_srcm_stmt" +
                                               "_kind_tgtmBDD.jedd:36,28"),
                                              bdd).iterator(new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() });
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
        return new Iterator() {
            public boolean hasNext() { return it.hasNext(); }
            
            public Object next() { return Rctxt_local_obj_srcm_stmt_kind_tgtmBDD.this.new Tuple((Object[]) it.next()); }
            
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
    
    public jedd.internal.RelationContainer get() {
        final jedd.internal.RelationContainer ret =
          new jedd.internal.RelationContainer(new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() },
                                              new PhysicalDomain[] { V2.v(), V1.v(), H1.v(), T1.v(), ST.v(), FD.v(), T2.v() },
                                              ("<soot.jimple.spark.bdddomains.ctxt:soot.jimple.spark.bdddoma" +
                                               "ins.V2, soot.jimple.spark.bdddomains.local:soot.jimple.spark" +
                                               ".bdddomains.V1, soot.jimple.spark.bdddomains.obj:soot.jimple" +
                                               ".spark.bdddomains.H1, soot.jimple.spark.bdddomains.srcm:soot" +
                                               ".jimple.spark.bdddomains.T1, soot.jimple.spark.bdddomains.st" +
                                               "mt:soot.jimple.spark.bdddomains.ST, soot.jimple.spark.bdddom" +
                                               "ains.kind:soot.jimple.spark.bdddomains.FD, soot.jimple.spark" +
                                               ".bdddomains.tgtm:soot.jimple.spark.bdddomains.T2> ret = bdd;" +
                                               " at /home/olhotak/soot-2-jedd/src/soot/jimple/spark/queue/Rc" +
                                               "txt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:47,8"),
                                              bdd);
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
        return new jedd.internal.RelationContainer(new Attribute[] { obj.v(), ctxt.v(), tgtm.v(), local.v(), kind.v(), stmt.v(), srcm.v() },
                                                   new PhysicalDomain[] { H1.v(), V2.v(), T2.v(), V1.v(), FD.v(), ST.v(), T1.v() },
                                                   ("return ret; at /home/olhotak/soot-2-jedd/src/soot/jimple/spa" +
                                                    "rk/queue/Rctxt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:49,8"),
                                                   ret);
    }
    
    public boolean hasNext() {
        return !jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD());
    }
    
    private final class Tuple extends soot.jimple.spark.queue.Rctxt_local_obj_srcm_stmt_kind_tgtm.Tuple {
        private Object[] tuple;
        
        public Tuple(Object[] tuple) {
            super();
            this.tuple = tuple;
        }
        
        public Context ctxt() { return (Context) tuple[0]; }
        
        public Local local() { return (Local) tuple[1]; }
        
        public AllocNode obj() { return (AllocNode) tuple[2]; }
        
        public SootMethod srcm() { return (SootMethod) tuple[3]; }
        
        public Unit stmt() { return (Unit) tuple[4]; }
        
        public Kind kind() { return (Kind) tuple[5]; }
        
        public SootMethod tgtm() { return (SootMethod) tuple[6]; }
    }
    
}
