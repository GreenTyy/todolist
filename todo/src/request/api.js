//统一管理接口
import {api} from './http.js';
export default{
	
	async GetInfro(param){
		uni.request({
			url:api+'/task/taskInfo',
			data:{
				
			}
		})
	}
}