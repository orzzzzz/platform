require(['admin/business/view/collegeListView'], function (view) {
   view.init();
});

// var zTree;
// var setting = {
//    view: {
//       dblClickExpand: false,//双击节点时，是否自动展开父节点的标识
//       showLine: true,//是否显示节点之间的连线
//       fontCss: {'color': 'black', 'font-weight': 'bold'},//字体样式函数
//       selectedMulti: false //设置是否允许同时选中多个节点
//    },
//    check: {
//       //chkboxType: { "Y": "ps", "N": "ps" },
//       chkStyle: "checkbox",//复选框类型
//       enable: true //每个节点上是否显示 CheckBox
//    },
//    data: {
//       simpleData: {//简单数据模式
//          enable: true,
//          idKey: "id",
//          pIdKey: "pId",
//          rootPId: ""
//       }
//    },
//    callback: {
//       beforeClick: function (treeId, treeNode) {
//          zTree = $.fn.zTree.getZTreeObj("user_tree");
//          if (treeNode.isParent) {
//             zTree.expandNode(treeNode);//如果是父节点，则展开该节点
//          } else {
//             zTree.checkNode(treeNode, !treeNode.checked, true, true);//单击勾选，再次单击取消勾选
//          }
//       }
//    }
// };
//
// var zNodes =[
//    { id:1, pId:0, name:"test 1", open:false},
//    { id:11, pId:1, name:"test 1-1", open:true},
//    { id:111, pId:11, name:"test 1-1-1"},
//    { id:112, pId:11, name:"test 1-1-2"},
//    { id:12, pId:1, name:"test 1-2", open:true},
// ];
//
// function onCheck(e,treeId,treeNode){
//    var treeObj=$.fn.zTree.getZTreeObj("user_tree"),
//        nodes=treeObj.getCheckedNodes(true),
//        v="";
//    for(var i=0;i<nodes.length;i++){
//       v+=nodes[i].name + ",";
//       alert(nodes[i].id); //获取选中节点的值
//    }
// }
//
// $(document).ready(function(){
//    $.fn.zTree.init($("#user_tree"), setting, zNodes);
// });
