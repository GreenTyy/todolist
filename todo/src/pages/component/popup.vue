<template>
	<view class="add_task">
		<view class="popup_title">
			<image class="popup_bg" src="../../../static/titleBg.png"></image>
			<text class="title">添加任务</text>
		</view>
		<view class="subsection">
			<u-subsection :list="list" mode="button" @change="changeTask" :current="index" activeColor="#A498B4"></u-subsection>
		</view>
		<view class="task_name">
			<u--input placeholder="请输入待办名称"  @change="setTname"></u--input>
		</view>
		<view class="other">
			<view class="selectClock">
				<u-subsection :list="select_clock" mode="button" activeColor="#f56c6c" bgColor="#A498B4"></u-subsection>
			</view>
			<view class="habit" v-show="habit">
					<view class="pop_tit">
						<text>我想</text>
					</view>
					<view class="radio">
						<u-radio-group  placement="row">
							<u-radio activeColor="red" label="每周"></u-radio>
							<u-radio label="每天"></u-radio>
							<u-radio label="每月"></u-radio>
						</u-radio-group>
					</view>
		    </view>
			<view v-show="habit"> 
				<view class="pop_tit">
					<text>完成量</text>
				</view>
				<view class="number_box">
					<u-slider min="1" max="80" blockSize="20px" showValue = "true" @change="setTfre"></u-slider>
				</view>
			</view>
			<view class="deadline" v-show="target">
				<view class="pop_tit">
					<text>截止日期</text>
				</view>
				<view class="date_btn">
					2024-08-28
				</view>
				<view class="deadline_date">
					<u-datetime-picker mode="date"></u-datetime-picker>
			    </view>
	        </view>
		</view>
		<view class="button">
			<u-button text="取消" color="#A498B4" @click="close()"></u-button>
			<u-button text="确定" color="#A498B4" @click="submit(t)"></u-button>
		</view>
	</view>
</template>

<script>
import taskVue from '../task/task.vue';
	export default {
		name: "taskPopupz",
		data() {
			return {
				index:0,
				t:{
					t_name:'',
					t_frequence:0,
				},
				habit:false,
				target:false,
				list: ["普通钟", "养习惯", "定目标"],
				select_clock: ["正计时", "番茄钟"],
				columns:["每天","每月","每周"]
			};
		},
		methods:{
			close() {
				this.$emit('get');
				uni.$emit('close',this.show = false);
			},
			changeTask(e){
				this.index = e;
				if(this.index == 0){
					this.habit = false;
					this.target = false;
				}
				if(this.index == 1){
					this.habit = true;
					this.target = false;
				}
				if(this.index == 2){
					this.habit = false;
					this.target = true;
				}
			},
			setTname(e){
				this.t.t_name = e
			},
			setTfre(e){
				this.t.t_frequence = e
			},
			async addTask(t){
			 await uni.request({
					url:'http://localhost:8081/task/addTask',
					method:'POST',
					data:{
						task_name:t.t_name,
						frequence:t.t_frequence
					}
				})
			},
		    submit(t){
				this.addTask(t);
				this.close();
			}
		}
	}
</script>
<style lang="scss">
	.popup_title {
		width: auto;
		height: 60px;
	}

	.popup_bg {
		width: 100%;
		height: 50px;
		position: absolute;
	}

	.subsection {
		width: 90%;
		margin: auto;
	}

	.title {
		position: absolute;
		top: 15px;
		left: 10px;
		color: white;
		font-weight: bold;
	}

	.task_name {
		width: 90%;
		height: 50px;
		margin: auto;
	}

	.other {
		width: 270px;
		height: auto;
	}

	.selectClock {
		width: 80%;
		margin-left: 30px;
		margin-bottom: 20px;
	}
	.button {
		height: 0;
		display: flex;
	}
	.pop_tit{
		font-weight: bold;
		margin-left: 10px;
	}
	.radio{
		margin-left: 50px;
	}
	.date_btn{
		margin-left: 90px;
	}
	.habit,.deadline{
		display: flex;
		margin-top: 10px;
		margin-bottom: 20px;
	}
</style>