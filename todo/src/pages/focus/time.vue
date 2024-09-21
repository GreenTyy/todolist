<template>
	<view>
		<view class="motto">
			<text>显示系统中消耗CPU最多的进程显示文件系统的磁盘空间使用情况显示目录的总磁盘使用情况。
</text>
		</view>
		<view class="circle">
			<view class="circle1">
				<view class="time">
					<text>00:00</text>
				</view>
			</view>
		</view>
		<view class="oper">
			<u-icon name="reload" color="white" size="30px" width="60px"></u-icon>
			<u-icon name="pause" color="white" size="30px" width="60px"></u-icon>
			<u-icon name="trash" color="white" size="30px" width="60px"></u-icon>
		</view>
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
	page{
		background-image: url("../../../static/bg.png");
	}
	.motto{
		width: 80%;
		height: auto;
		margin: auto;
		margin-top: 40px;
		font-weight: bold;
	}
	.circle{
		margin-top: 20%;
		display: flex;
	}
	.circle1{
		margin: auto;
		width: 270px;
		height: 270px;
		border-radius: 270px;
		background-color: white;
		opacity: 0.7;
		display: flex;
	}
	.time{
		margin: auto;
		font-size: 70px;
		font-weight: bold;
	}
	.oper{
		width: 70%;
		height: 60px;
		margin-top: 50%;
		margin-left: 50px;
		border-radius: 10px 10px 10px 10px;
		display: flex;
		background-color: #21263D;
	}
	.u-icon{
		margin-left: 17%;
	}
</style>50px;
