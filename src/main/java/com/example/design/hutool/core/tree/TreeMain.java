package com.example.design.hutool.core.tree;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNode;
import cn.hutool.core.lang.tree.TreeUtil;
import java.util.List;

public class TreeMain {

	// 模拟数据
	static List<TreeNode<String>> nodeList = CollUtil.newArrayList();

	static {
		// 模拟数据
		nodeList.add(new TreeNode<>("1", "0", "系统管理", 1));
		nodeList.add(new TreeNode<>("111", "11", "用户添加", 0));
		nodeList.add(new TreeNode<>("11", "1", "用户管理", 222222));

		nodeList.add(new TreeNode<>("2", "0", "店铺管理", 2));
		nodeList.add(new TreeNode<>("21", "2", "商品管理", 44));
		nodeList.add(new TreeNode<>("221", "2", "商品管理2", 2));
	}

	public static void main(String[] args) {
		// 构建树结构
		List<Tree<String>> treeList = TreeUtil.build(nodeList, "0");
		treeList.forEach(item -> System.out.println(item.toString()));
	}


}
