<template>
  <view>
	  <myLayout></myLayout>
		<view class="user_tip">
			<view class="cell">
			<text>个人笔记</text>
			<u-line dashed color="black" length="90%"></u-line>
			<view class="note">
			<u--textarea  placeholder="请输入内容" ></u--textarea>
			</view>
			</view>
		</view>
		//弹出框
  </view>
</template>
<script>
	import myLayout from '@/src/pages/component/myLayout.vue'
	export default {
		components:{
			myLayout
		}
	}
</script>
<style lang="scss">
	.my_bg{
		position: absolute;
		width: 100%;
		height: 100%;
	}
	.user_tip{
		position: relative;
		width: 80%;
		height: auto;
		top: 10px;
		left: 10%;
		background-color: white;
		border-radius: 10px 10px 10px 10px;
	}
	.cell{
		top: 10px;
		padding: 15px 0 8px 15px;
	}
	.note{
		width: 90%;
		height: auto;
		border: 2px solid black;
		background-color: white;
		box-shadow: 10px 10px;
		margin: 10px 0 10px 0;
	}
</style>
