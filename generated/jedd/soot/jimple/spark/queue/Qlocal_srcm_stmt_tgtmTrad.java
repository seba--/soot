package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public class Qlocal_srcm_stmt_tgtmTrad extends Qlocal_srcm_stmt_tgtm {
    private ChunkedQueue q = new ChunkedQueue();
    
    public void add(Local _local, SootMethod _srcm, Unit _stmt, SootMethod _tgtm) {
        q.add(_local);
        q.add(_srcm);
        q.add(_stmt);
        q.add(_tgtm);
    }
    
    public void add(final jedd.internal.RelationContainer in) {
        Iterator it =
          new jedd.internal.RelationContainer(new Attribute[] { tgtm.v(), local.v(), stmt.v(), srcm.v() },
                                              new PhysicalDomain[] { T2.v(), V1.v(), ST.v(), T1.v() },
                                              ("in.iterator(new jedd.Attribute[...]) at /home/olhotak/soot-2" +
                                               "-jedd/src/soot/jimple/spark/queue/Qlocal_srcm_stmt_tgtmTrad." +
                                               "jedd:39,22"),
                                              in).iterator(new Attribute[] { local.v(), srcm.v(), stmt.v(), tgtm.v() });
        while (it.hasNext()) {
            Object[] tuple = (Object[]) it.next();
            for (int i = 0; i < 4; i++) { q.add(tuple[i]); }
        }
    }
    
    public Rlocal_srcm_stmt_tgtm reader() { return new Rlocal_srcm_stmt_tgtmTrad(q.reader()); }
    
    public Qlocal_srcm_stmt_tgtmTrad() { super(); }
}
