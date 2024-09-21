<template>
<view> 
   <view class="calendar">
	   <uni-calendar 
	   	:insert="true"
	   	 />
   </view>
   <view> 
	   <view class="today_pro"> 
	   <view class="today_title" style="background-color: #FFC272;">
		   <u--text text="当日日程" bold="true" size="20px" ></u--text>
	   </view>
	   <view>·当日日程任务</view>
	   </view>
	   <view class="urge_pro"> 
	   <view class="urge_title" style="background-color: #7285FF;">
		   <u--text text="紧急日程" bold="true" size="20px"></u--text>
	   </view>
	   <view>·紧急日程任务 + 日期</view>
	   </view>
   </view>
   <u-popup :show="true" mode="bottom">
           <view>
              添加日程：<u--input placeholder="请输入日程内容"></u--input>
			  截止日期：<u--input placeholder="请输入日程截止日期"></u--input>
           </view>
   	</u-popup>
</view>
</template>

<script>
	export default {
		data() {
			return {
				
			};
		}
	}
</script>
<style lang="scss">
    .calendar{
		width: auto;
		height: 100px;
	}
    .today_pro{
		width: 150px;
		height: 300px;
		margin: 320px 0 0 20px;
		background-color: #D9D9D9;
		border-radius: 10px 10px 10px 10px;
		float: left;
	}
	.urge_pro{
		width: 150px;
		height: 300px;
		margin: 320px 20px 0 20px;
		background-color: #D9D9D9;
		border-radius: 10px 10px 10px 10px;
		float: right;
	}
	.today_title,.urge_title{
		width: 150px;
		height: 30px;
		border-radius: 10px 10px 10px 10px;
	}
</style>
