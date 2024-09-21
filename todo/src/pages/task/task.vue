<template>
<view>
	<view class="topNav">
	    <view  class="title">
			<u--text text="Task" size="30px"  margin="15px 0 0 20px"></u--text>
		</view>	
			<u-icon name="plus-circle-fill" size="30px" @click="ShowPop()"></u-icon>
	</view>
	<taskList ref="taskList"></taskList>
	<!-- 添加弹出框 -->
	<u-popup mode="center" bgColor="#A498B4" :show="showPop">
	    <tashPopup @get="get"></tashPopup>
	</u-popup>
</view>
</template>
<script>
	import taskList from '@/src/pages/component/task_list.vue';
	import tashPopup from '@/src/pages/component/popup.vue';
	export default {
		components:{
			taskList,
			tashPopup
		},
		data(){
			return{
				showPop:false,
			}
		},
		mounted(){
			uni.$on('close',(data)=>{
				this.showPop = data
				console.log("pupup返回成功"+data);
			})
		},
		methods:{
			get(){
				this.$refs.taskList.getTasks();
			},
			ShowPop(){
				this.showPop =  true
			},
			getShowPop(show){
				this.showPop = show
				console.log(show);
			}
		},
	}
</script>

<style lang="scss">
	.topNav{
		height: 70px;
	}
	.title{
		width: 100px;
		float: left;
	}
	.u-icon{
		padding-top: 20px;
		padding-right: 30px;
		float: right;
	}

</style>
