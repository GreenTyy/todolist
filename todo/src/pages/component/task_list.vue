<template>
	<view >
		<u-swipe-action>
			<u-swipe-action-item :options="options" @click="remove(task)"v-for="task in tasks">
				<view class="task">
					<view class="block"></view>
					<view class="task_name" >
						{{ task }}
					</view>
					<view class="task_start_btn">
						<u-button class="task_start_btn" color="#D9D9D9" @click="start()">
							<u--text text="START"></u--text>
						</u-button>
					</view>
				</view>
			</u-swipe-action-item>
		</u-swipe-action>
	</view>
</template>

<script>
	export default {
		name: "task_list",
		data() {
			return {
				index:new Number(57),
				tasks:[],
				options: [{
					text: '删除',
					style: {
						backgroundColor: '#f56c6c'
					}
				}]
			};
		},
		created() {
			this.getTasks();
			console.log(this.index);
		},
		methods:{
		remove(task){
		    uni.request({
		   	url:'http://localhost:8081/task/removeTask?task_name='+task,
			method:'DELETE',
			success: () => {
				console.log("调用删除接口成功"+typeof task);
				this.getTasks();
			},
		   })	
		},
		getTasks(){
				uni.request({
					url:'http://localhost:8081/task/taskInfo',
					success: (res) => {
						console.log(res);
						this.tasks = res.data;
					}
				})
			},
			start(){
				uni.redirectTo({
					url:"../focus/time"
				})
			}
		}
	}
</script>

<style lang="scss">
	.u-swipe-action-item{
		margin-top: 20px;
		margin-left: 20px;
		width: 90%;
		height: 100%;
	}
	.task{
		display: flex;
		background-color: #D9D9D9;
		width: 100%;
		height: 60px;
		border-radius: 7px 7px 7px 7px;
	}
	.block{
		width: 22px;
		height: 100%;
		border-radius: 7px 7px 7px 7px;
		background-color: #76D149;
		float: left;
	}
	.task_name{
		 font-weight: bold;
		 padding: 9px 0 0 9px;
		 float: left;
	}
	.task_start_btn{
		float: right;
	}
</style>