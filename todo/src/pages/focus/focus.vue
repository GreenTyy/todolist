<template>
<view style="padding: 15%;">
		<view class="clockSec">
		<view>
				<u-row gutter="10">
					<u-col span="8">
						<view>
							<u--text prefixIcon="clock"  iconStyle="font-size: 19px" text="正计时" bold="true"></u--text>
						</view>
					</u-col>
					<u-col span="8">
						<view>
							<u--text suffixIcon="star" iconStyle="font-size: 19px" text="番茄钟" bold="true"></u--text>
						</view>
					</u-col>
				</u-row>
			</view>
		</view>
			<!-- <image src="../../static/Sprite-0003.png" class="clock_img"></image> -->	
        <view class="startbtn">
			<u-button shape="circle" color="#A498B4" @click="start()">START</u-button>
		</view>
</view>
</template>
<script>
	export default {
		data(){
			return{
			}
		},
		methods:{
			start(){
				uni.redirectTo({
					url:"time"
				})
			}
				}
	}
</script>
<style lang="scss">
	page{
		background-image: url("../../../static/bg.png");
	}
	.startbtn{
		width: 120px;
		padding-top: 500px;
		margin: auto;	
	}
	.clock_img{
		width: 300px;
		height: 200px;
		margin: auto;
	}
</style>
