/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Ondrej Lhotak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package soot.jimple.spark;
import soot.jimple.spark.queue.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import java.util.*;

/** Keeps track of which methods are reachable.
 * @author Ondrej Lhotak
 */
public class TradReachableMethods extends AbsReachableMethods
{ 
    private Set reachables = new HashSet();
    private AbsCallGraph cg;
    private Rctxt_method newMethods;
    TradReachableMethods( Rsrcc_srcm_stmt_kind_tgtc_tgtm in, Qctxt_method out, AbsCallGraph cg ) {
        super( in, out );
        this.cg = cg;
        newMethods = out.reader();
    }
    private void processEdge( Rsrcc_srcm_stmt_kind_tgtc_tgtm.Tuple t ) {
        if( !reachables.contains( MethodContext.v( t.srcm(), t.srcc() ) ) ) return;
        MethodOrMethodContext momc = MethodContext.v( t.tgtm(), t.tgtc() );
        if( reachables.add( momc ) ) {
            out.add( t.tgtc(), t.tgtm() );
        }
    }
    void update() {
        for( Iterator tIt = in.iterator(); tIt.hasNext(); ) {
            final Rsrcc_srcm_stmt_kind_tgtc_tgtm.Tuple t = (Rsrcc_srcm_stmt_kind_tgtc_tgtm.Tuple) tIt.next();
            processEdge( t );
        }
        while( newMethods.hasNext() ) {
            for( Iterator tIt = cg.edgesOutOf( newMethods ).iterator(); tIt.hasNext(); ) {
                final Rsrcc_srcm_stmt_kind_tgtc_tgtm.Tuple t = (Rsrcc_srcm_stmt_kind_tgtc_tgtm.Tuple) tIt.next();
                processEdge( t );
            }
        }
    }
    void add( MethodOrMethodContext m ) {
        if( reachables.add( m ) ) {
            out.add( m.context(), m.method() );
        }
    }
}

