package render;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import gdecid.visual.tuple.TableEdgeItem;
import gdecid.visual.tuple.TableNodeItem;
import gdecid.visual.tuple.TableVisualItem;


public class TupleSet {
	
	private Map<String, Object> Nodes;
	private List<Object> Edges;
	
	public TupleSet() {
		NodesInit();
		EdgesInit();
	}
	
	private void NodesInit() {
		Nodes = new LinkedHashMap<String, Object>();
		Nodes.put("����", new TableNodeItem("����"));
		Nodes.put("�Ϻ�", new TableNodeItem("�Ϻ�"));
		Nodes.put("����", new TableNodeItem("����"));
		Nodes.put("����", new TableNodeItem("����"));
		Nodes.put("���", new TableNodeItem("���"));
	}
	
	private void EdgesInit() {
		Edges = new ArrayList<Object>();
		Edges.add(new TableEdgeItem("����", "�Ϻ�"));
		Edges.add(new TableEdgeItem("�Ϻ�", "����"));
		Edges.add(new TableEdgeItem("����", "����"));
		Edges.add(new TableEdgeItem("����", "���"));
		Edges.add(new TableEdgeItem("���", "�Ϻ�"));
	}


	public Map<String, Object> getNodes() {
		return Nodes;
	}

	public void setNodes(Map<String, Object> nodes) {
		Nodes = nodes;
	}

	public List<Object> getEdges() {
		return Edges;
	}

	public void setEdges(List<Object> edges) {
		Edges = edges;
	}
}
