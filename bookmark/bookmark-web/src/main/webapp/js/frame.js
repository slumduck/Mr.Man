/**
 * 静态模拟用于测试
 * 对象模型
 * model = {
 * 	dl_class:"",//生成一个无任何样式的class用于标记该dt
 *  dl_index:0,//设置dl所在位置及显示时的位置
 *  dt_backgroud_image:"",//dt的背影图片
 *  dt_description:"",//标题描述
 *  //注：每个dl对象包含多个dd对象
 *  dd_a_href:"",//用于跳转的url
 *  dd_a_description:"",//连接描述
 *  dd_target:"" //标记跳转到哪个frame,这个直接从前台获取
 *  dd_index:0//设置dd的显示顺序，位置
 *  这里还应该有个角色或者说权限用于做是否显示的判断，
 *  当然也可以通过后台的查询判断这样更好，不会导致页面有无用的元素
 * }
 * 注：图片的位置应该遵循约定俗成的规则，这样不至于很乱
 * 此处导航图片均位于：images/left目录下，当单独提出js后需要注意图片路径
 */
/* 突然感觉这种全局的控制交由后台不是很好，
 * 如果要更改样式可能不是很方便，
 * 那么这种写法最好的应用环境就是基本结构固定，只限于修改部分细节如背景图片、字体等
 * 但是交由后台的一个好处就是可以动态的配置，适合前后台都会的
 */
var staticImitate = [
//system_log
{dl_class:"system_log",dt_backgroud_image:"images/left/system.png",dt_description:"系统记录",
  dl_dd: 
  [{dd_a_href:"welcome.html",dd_a_description:"充值记录",dd_target:"main",dd_index:1},
   {dd_a_href:"welcome.html",dd_a_description:"短信充值记录",dd_target:"main",dd_index:0},
   {dd_a_href:"welcome.html",dd_a_description:"消费记录",dd_target:"main",dd_index:2},
   {dd_a_href:"welcome.html",dd_a_description:"操作记录",dd_target:"main",dd_index:3}
  ],
  dl_index:7
},
//custom
{dl_class:"custom",dt_backgroud_image:"images/left/custom.png",dt_description:"客户管理",
   dl_dd:
   [{dd_a_href:"welcome.html",dd_a_description:"客户管理",dd_target:"main",dd_index:0},
    {dd_a_href:"welcome.html",dd_a_description:"试用/成交客户管理",dd_target:"main",dd_index:1},
    {dd_a_href:"welcome.html",dd_a_description:"未成交客户管理",dd_target:"main",dd_index:2},
    {dd_a_href:"welcome.html",dd_a_description:"即将到期客户管理",dd_target:"main",dd_index:3}
   ],
   dl_index:3
},
//channel
{dl_class:"channel",dt_backgroud_image:"images/left/channel.png",dt_description:"渠道管理",
   dl_dd:
   [{dd_a_href:"welcome.html",dd_a_description:"渠道主页",dd_target:"main",dd_index:0},
    {dd_a_href:"welcome.html",dd_a_description:"渠道标准管理",dd_target:"main",dd_index:1},
    {dd_a_href:"welcome.html",dd_a_description:"渠道商管理",dd_target:"main",dd_index:2},
    {dd_a_href:"welcome.html",dd_a_description:"渠道商链接",dd_target:"main",dd_index:3}
   ],
   dl_index:5
},
//app
{dl_class:"app",dt_backgroud_image:"images/left/app.png",dt_description:"APP管理",
   dl_dd:
   [{dd_a_href:"welcome.html",dd_a_description:"App运营商管理",dd_target:"main",dd_index:0},
    {dd_a_href:"welcome.html",dd_a_description:"开放接口管理",dd_target:"main",dd_index:1},
    {dd_a_href:"welcome.html",dd_a_description:"接口类型管理",dd_target:"main",dd_index:2}
   ],
   dl_index:4
},
//cloud
{dl_class:"cloud",dt_backgroud_image:"images/left/cloud.png",dt_description:"大数据云平台",
   dl_dd:
   [{dd_a_href:"welcome.html",dd_a_description:"平台运营商管理",dd_target:"main",dd_index:0}],
   dl_index:2
},
//syetem_management
{dl_class:"syetem_management",dt_backgroud_image:"images/left/syetem_management.png",dt_description:"系统管理",
   dl_dd:
   [{dd_a_href:"welcome.html",dd_a_description:"后台用户管理",dd_target:"main",dd_index:0},
    {dd_a_href:"welcome.html",dd_a_description:"角色管理",dd_target:"main",dd_index:1},
    {dd_a_href:"welcome.html",dd_a_description:"客户类型管理",dd_target:"main",dd_index:2},
    {dd_a_href:"welcome.html",dd_a_description:"栏目管理",dd_target:"main",dd_index:3},
    {dd_a_href:"welcome.html",dd_a_description:"微官网模板组管理",dd_target:"main",dd_index:4},
    {dd_a_href:"welcome.html",dd_a_description:"商城模板管理",dd_target:"main",dd_index:5},
    {dd_a_href:"welcome.html",dd_a_description:"微功能管理",dd_target:"main",dd_index:6},
    {dd_a_href:"welcome.html",dd_a_description:"修改用户密码",dd_target:"main",dd_index:7}
   ],
   dl_index:6
},
//source
{dl_class:"source",dt_backgroud_image:"images/left/source.png",dt_description:"素材库管理",
   dl_dd:
   [{dd_a_href:"welcome.html",dd_a_description:"图片库",dd_target:"main",dd_index:0},
    {dd_a_href:"welcome.html",dd_a_description:"链接库",dd_target:"main",dd_index:1},
    {dd_a_href:"welcome.html",dd_a_description:"推广管理",dd_target:"main",dd_index:2}
   ],
   dl_index:1
},
//statistics
{dl_class:"system_log",dt_backgroud_image:"images/left/statistics.png",dt_description:"统计分析",
   dl_dd:
   [{dd_a_href:"welcome.html",dd_a_description:"客户统计",dd_target:"main",dd_index:0}],
   dl_index:0
}
];
$(function(){
   //渲染页面开始时，打开遮罩
   $.merge(getOverlay(),getOverlay().next()).show();
   //左侧导航的切换
   indexInit.initNavigation();
   //导航条的点击事件
   indexInit.clickNavigation();  
   //设置图片
   $("dt > img").attr("src",dt_img.close);
   setInterval("twinkle()",500);
   //页面渲染完毕时，关闭遮罩
   $.merge(getOverlay(),getOverlay().next()).hide();
});

/**
 * 全局的属性
 * dt_img:设置单击时箭头的图标
 * dt_backgroudColor:设置导航的背景颜色
 */
var dt_img = {open:"images/left/select_xl.png",close:"images/left/select_xl01.png"};
var dt_backgroudColor = {open:"#317eb4",close:"#3992d0"};
var indexInit = {
	    //为标题绑定click事件
		clickNavigation: function() {
			$(".left dt").on("click", function(e) {
				var currentDT = $(this);
				$.each($(".left dt"), function(i, info) {
					//console.log($(this) != currentDT);竟然没有相等的 太假了
					/**
					 * 将其他已经展开的dd元素隐藏
					 */
					if($(this).html() != currentDT.html() && $(this).next().css("display") == "block") {
						$(this).css({"background-color": dt_backgroudColor.close});
						$(this).parent().find('img').attr("src", dt_img.close);
                        $(this).parent().find("dd").css("display", "none");
						//退出each 循环，each中break（报错）和直接return都不能退出循环
						return false;
					}
				});
				var $dd_ = $(this).parent().find("dd");
				//对目标对象的操作
				if($dd_.css("display") == "none") {
					$(this).css({"background-color": dt_backgroudColor.open});
					$(this).parent().find('img').attr("src", dt_img.open);
					$(this).parent().find("dd").css("display", "block");
				} else {
					$(this).css({"background-color": dt_backgroudColor.close});
					$(this).parent().find('img').attr("src", dt_img.close);
					$(this).parent().find("dd").css("display", "none");
				}
			});
		},
		/**
		 * 初始化导航条
		 *<dl class="system_log">
		 *  <dt >系统记录<img ></dt>
		 *	<dd><a href="welcome.html" target="main">充值记录</a></dd>
		 *	<dd><a href="welcome.html" target="main">短信充值记录</a></dd>
		 *	<dd><a href="welcome.html" target="main">消费记录</a></dd>
		 *	<dd><a href="welcome.html" target="main">操作记录</a></dd>
         *</dl>
		 */
		//fuck 啊js生成初始化的时候会闪！！！！！
		initNavigation:function(){
			/**
			 * 外层循环用于写dl、dt元素
			 * 内层循环用于写dd元素
			 */
			var dlArray = [];//new Array(staticImitate.length);
			//var html = "";
			//$("#rightDiv").contents();
			var target = $("#rightDiv").find("iframe").attr("name");
			$.each(staticImitate,function(i,info){
				//设置dl
				dlArray[info.dl_index] = "<dl class='"+info.dl_class+"'>";
				
				//设置dt style="background-image: url(images/left/cloud.png);"
				dlArray[info.dl_index] += "<dt style='background-image: url("
				                              +info.dt_backgroud_image+");'>"
				                              +info.dt_description+"<img ></dt>";
				
				if(info.dt_backgroud_image == null || info.dt_backgroud_image == ""){
					info.dt_backgroud_image = "images/left/system.png";
				}
				//设置dd
				var ddArray = [];//new Array(info.dl_dd.length);
				$.each(info.dl_dd,function(i,$info){
					/**
					 * 如果页面中仅有一个frame那么不需要配置
					 * target = $info.dd_target
					 */
					ddArray[$info.dd_index] = "<dd><a href='"+$info.dd_a_href+"' target='"+target+"'>"+$info.dd_a_description+"</a></dd>";
				});
				if(ddArray.length > 0){
				  dlArray[info.dl_index] += String.prototype.concat.apply("", tools.removeElementFromArray(ddArray));
				}
				//end
				dlArray[info.dl_index] += "</dl>";
			});
			$(".left").append(String.prototype.concat.apply("", tools.removeElementFromArray(dlArray)));
			//清除数据，减少不必要的内存浪费
			staticImitate = null;
		}
};
var tools = {
	//删除数组中为null,"","undefined"的元素
	removeElementFromArray:function($arry){
		if($arry instanceof Array){
			var arry = [];
			for(var i=0; i<$arry.length; i++){
				if($arry[i] == "" || $arry[i] == "undefined" || $arry[i] == null){
					continue;
				}
				arry.push($arry[i]);
			}
			return arry;
		}else{
			alert("初始化导航条异常");
			return;
		}
	}
};
//用于将信息传递到子页面
function getOverlay(){
	return $("#froverlay");
}
function twinkle(){
	if(!(navigator.userAgent.indexOf("MSIE 8.0")>0)){
		$(".twinkle").fadeToggle();
	}
}