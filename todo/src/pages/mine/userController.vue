<template>
  <view>
		<myLayout></myLayout>
		<view class="user_tip">
			<view class="cell" v-for="(item,index) in myList">
			<text>{{ item }}</text>
			<u-line dashed color="black" length="90%"></u-line>
			</view>
		</view>
		//弹出框
  </view>
</template>
<script>
	import myLayout from '@/src/pages/component/myLayout.vue'
	export default {
		data(){
			return{
				myList:["头像上传","修改昵称","id名称","email"]
			}
		},
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
		top: 30px;
		left: 10%;
		background-color: white;
		border-radius: 10px 10px 10px 10px;
	}
	.cell{
		top: 10px;
		padding: 15px 0 8px 15px;
	}
</style>
