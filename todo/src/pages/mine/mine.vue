<template>
	<view>
		<image src="../../../static/image.png" class="myBg"></image>
		<view class="userShow" @click="show = true">
			    <u-avatar :src="src" size="70px"></u-avatar>
				<view class="userInfo">
					<view>账号：{{ user.id}}</view>
					<view>昵称：{{ user.name }}</view>
					<view>邮箱：{{ user.email }}</view>
				</view>
		</view>
		<uni-card v-for="(item,index) in myList" @click="setClick(item.path)">
			<text>{{ item.title }}</text>
			<u-icon name="arrow-right" color="black"></u-icon>
		</uni-card>
	<u-divider
	        text="更多功能等待中"
	        textColor="#A6A6A6"
	        lineColor="#A6A6A6"
	></u-divider>
	<u-modal :show="show" :title="title" width="270px" showCancelButton="true" @cancel="cancel">
		<view>
			添加用户名：<u--input placeholder="请输入用户昵称" border="bottom" clearable></u--input>
			添加用户邮箱：<u--input placeholder="请输入用户邮箱" border="bottom" clearable></u--input>
		</view>
	</u-modal>
	</view>
</template>
<script>
import { vShow } from "vue"
	export default{
		data(){
			return{			
				user:{
				id:0,
				name:"默认用户",
				email:"未登录"
			},
			   show:false,
			   title:'添加新用户',
			   motto:"The investment future person will be,will be loyal to the realitypersom",
				myList:[
					{
					title:"用户管理",
					path:"userController"
					},
					{
					title:"数据统计",
					path:"dataSur"
					},
					{
					title:"个性化设置",
					path:"perSet"
					},
					{
					title:"个人笔记",
					path:"perNote"
					},
					{
					title:"帮助与反馈",
					path:"help"
					}
				]
			}
		},
		methods: {
			setClick(url){
				uni.redirectTo({
					url
				})
		},
		cancel(){
			this.show = false;
			console.log("点击关闭按钮");
		}
	},
	}
</script>
<style lang="scss">
	page{
		background-color:#EBEBEB;
	}
	.myBg{
		width: 100%;
		height: 160px;
		position: relative;
	}
	.userShow{
		background-color: white;
		width: 90%;
		height: 140px;
		position: absolute;
		z-index: 2;
		top: 30px;
		left: 5%;
		border-radius: 10px 10px 10px 10px;
		opacity: 0.95;
		}
	.u-icon{
			float: right;
		}
	.u-avatar{
		padding-top: 30px;
		padding-left: 25px;
		float: left;
		}
	.userInfo{
			padding-top: 35px;
			padding-left: 30px;
			float: left;
		}
</style>
