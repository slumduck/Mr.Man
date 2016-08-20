(function($){
	/**
	 * 
	 */
	$.common = {
		/**
		 * 遮罩层
		 * 
		 * @param flag:打开或关闭(open/close)
		 */
		overlay : function(flag) {
			var overlay = parent.getOverlay(),
				loading = overlay.next();
			if (flag == "open") {
				$.merge(overlay,loading).show();
			} else {
				$.merge(overlay,loading).hide();
			}
		},
		format: {
			/**
			 * 千分位
			 * 
			 * @param money：金额
			 * @returns：String 千分位的金额
			 */
			money: function(money) {
				if(!money) money = 0;
				money = money + "";
				var index = money.indexOf("."),
					length = money.length;
				if(index < 0) {
					return money.replace(/(\d)(?=(\d{3})+$)/g, "$1,") + ".00";
				} else {
					var substr1 = money.substring(0, index),
						substr2 = money.substring(index, length);
					if(substr2.length == 2) {
						substr2 = substr2 + "0";
					} else if(substr2.length > 2) {
						substr2 = substr2.substring(0, 3);
					}
					return substr1.replace(/(\d)(?=(\d{3})+$)/g, "$1,") + substr2;
				}
			},
			/**
			 * 去掉千分位
			 * 
			 * @param money：千分位形式的金额
			 * @returns：String 金额（小数）
			 */
			removeThousand: function(money) {
				return money.replace(",", "");
			}
		}
	}
})(jQuery);
// 格式化时间
Date.prototype.format = function(f) {
	var o = {
		"M+" : this.getMonth() + 1, // month
		"d+" : this.getDate(), // day
		"h+" : this.getHours(), // hour
		"m+" : this.getMinutes(), // minute
		"s+" : this.getSeconds(), // second
		"q+" : Math.floor((this.getMonth() + 3) / 3), // quarter
		"S" : this.getMilliseconds()
	// millisecond
	}
	if (/(y+)/.test(f)) {
		f = f.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	}
	//RegExp.$1是RegExp的一个属性,指的是与正则表达式匹配的第一个 子匹配(以括号为标志)字符串，
	//以此类推，RegExp.$2，RegExp.$3，..RegExp.$99总共可以有99个匹配
	for ( var k in o) {
		if (new RegExp("(" + k + ")").test(f)) {
			f = f.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
		}
	}
	return f;
}
//字符串转换为时间：毫秒
String.prototype.formatToDate = function() {
	var str = this.toString().replace(/-/g, "/"), date = new Date(str), longTime = date.getTime();
	return longTime ? longTime : "";
}
//删除数组中指定元素的值
Array.prototype.remove = function(val) { 
	var index = this.indexOf(val); 
	if (index > -1) { 
		this.splice(index, val.length); 
	}
};
