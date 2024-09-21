<template>
  <view>
         <myLayout></myLayout>
		<view class="user_tip">
			<view class="cell" v-for="(item,index) in settings">
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
				settings:["自定义背景","自定义格言"]
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

