package com.agree.testutils;
/**
 * 二叉树
 * @author Yinlong
 *
 */

import java.util.ArrayList;

public class BiranyTree {
	public BiranyTree leftSubTree;
	public BiranyTree rightSubTree;
	public Object value;
	
	public void add(Object obj) {
		if (null == value) {
			value = obj;
		}else {
			if ((Integer)obj < (Integer)value) {
				if (null == leftSubTree) {
					leftSubTree = new BiranyTree();
				}
				leftSubTree.add(obj);
			}else {
				if (null == rightSubTree) {
					rightSubTree = new BiranyTree();
				}
				rightSubTree.add(obj);
			}
		}
	}
	/**
	 * 中序遍历
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Object> getNList() throws Exception{
		ArrayList<Object> treeList = new ArrayList<>(); 
		if (null == value) {
			throw new Exception("BirnyTree is null!");
		}
		if (null != leftSubTree) {
			treeList.addAll(leftSubTree.getNList());
		}
		treeList.add(value);
		if (null != rightSubTree) {
			treeList.addAll(rightSubTree.getNList());
		}
		return treeList;
	}
	//前序遍历
	public ArrayList<Object> getLList() throws Exception{
		ArrayList<Object> treeList = new ArrayList<>(); 
		if (null == value) {
			throw new Exception("BirnyTree is null!");
		}
		treeList.add(value);
		if (null != leftSubTree) {
			treeList.addAll(leftSubTree.getLList());
		}
		if (null != rightSubTree) {
			treeList.addAll(rightSubTree.getLList());
		}
		return treeList;
	}
	//后序遍历
	public ArrayList<Object> getRList() throws Exception{
		ArrayList<Object> treeList = new ArrayList<>(); 
		if (null == value) {
			throw new Exception("BirnyTree is null!");
		}
		if (null != leftSubTree) {
			treeList.addAll(leftSubTree.getRList());
		}
		if (null != rightSubTree) {
			treeList.addAll(rightSubTree.getRList());
		}
		treeList.add(value);
		return treeList;
	}
	
	public static void main(String[] args) {
		BiranyTree bt = new BiranyTree();
		bt.add(54);
		bt.add(23);
		bt.add(51);
		bt.add(24);
		bt.add(14);
		bt.add(434);
		bt.add(1);
		bt.add(4);
		try {
			System.out.println(bt.getNList());
			System.out.println(bt.getLList());
			System.out.println(bt.getRList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
