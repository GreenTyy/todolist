<template>
  <view>
		<image class="my_bg" src="../../../static/image.png"></image>
		<view class="return_btn">
			<u-button color="#A498B4" class="return_btn" shape="circle" @click="returnLastPage(lastPage)">返回</u-button>
		</view>
		//弹出框
  </view>
</template>
<script>
	export default {
		name:'my_layout',
		data() {
			return {
				lastPage:"mine"
			}
		},
		methods: {
			returnLastPage(url){
				uni.reLaunch({
					url
				})
			}
		}
	}
</script>
<style lang="scss">
	.my_bg{
		position: absolute;
		width: 100%;
		height: 100%;
	}
	.return_btn{
		position: relative;
		top:10px;
		left: 10px;
		width: 80px;
		height: 50px;
	}
</style>
