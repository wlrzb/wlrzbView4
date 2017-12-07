package render;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import gdecid.visual.tuple.TableNodeItem;
import gdecid.visual.tuple.TableVisualItem;


public class TupleSet {
	
	private Map<String, Object> Nodes;
	
	public void init() {
		Nodes = new LinkedHashMap<String, Object>();
		Nodes.put("����", new TableNodeItem("����"));
		Nodes.put("�Ϻ�", new TableNodeItem("�Ϻ�"));
		Nodes.put("����", new TableNodeItem("����"));
		Nodes.put("����", new TableNodeItem("����"));
		Nodes.put("���", new TableNodeItem("���"));
	}

	public void setNodes(Map<String, Object> nodes) {
		Nodes = nodes;
	}

	public TableNodeItem getNodes(String name) {
		return (TableNodeItem)Nodes.get(name);
	}

    public int getNodesCount() {
        int count = 0;
        Iterator it = Nodes.entrySet().iterator();
        for ( int i=0; it.hasNext(); ++i )  {
            Map.Entry entry = (Map.Entry)it.next();
            TupleSet ts = (TupleSet)entry.getValue();
            count += ts.getNodesCount();
        }
        return count;
    }
	
    public Iterator iterator() {
        CompositeIterator ci = new CompositeIterator(m_map.size());
        Iterator it = m_map.entrySet().iterator();
        for ( int i=0; it.hasNext(); ++i )  {
            Map.Entry entry = (Map.Entry)it.next();
            TupleSet ts = (TupleSet)entry.getValue();
            ci.setIterator(i, ts.tuples());
        }
        return ci;
    }
}
