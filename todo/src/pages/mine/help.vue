<template>
	<view>
				<myLayout></myLayout>
		<view class="user_tip">
					<view class="cell">
					<text>帮助与反馈</text>
					<u-line dashed color="black" length="90%"></u-line>
					<view class="text">
						感谢对个人独立创作的todo小程序的支持，小程序明确用户要求...
					</view>
					</view>
		</view>
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
	.text{
		padding-top: 6px;
		padding-right: 20px;
		font-size: 12px;
	}
</style>

