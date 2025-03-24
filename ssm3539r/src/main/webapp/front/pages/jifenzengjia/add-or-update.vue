<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"0 0 240rpx","position":"relative","background":"url(http://codegen.caihongy.cn/20221220/59a732694b3248ee8e6b685b4b45dc29.png) fixed,#f6f6f6","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">积分</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.jifen" v-model="ruleForm.jifen" placeholder="积分"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">增加时间</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.zengjiashijian" placeholder="增加时间" @tap="toggleTab('zengjiashijian')"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">增加事由</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zengjiashiyou" v-model="ruleForm.zengjiashiyou" placeholder="增加事由"></input>
			</view>
			
			<!-- 否 -->
 

			
			
			<view :style='{"width":"100%","margin":"40rpx 0 0 0","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0 40rpx","boxShadow":"2rpx 4rpx 8rpx #ccc","margin":"0 40rpx 0 0","color":"#333","borderRadius":"16rpx","background":"linear-gradient(80deg, rgba(233,190,112,1) 0%, rgba(254,236,200,1) 21%, rgba(249,224,176,1) 50%, rgba(252,235,199,1) 84%, rgba(233,190,112,1) 100%),#e9be70","display":"inline","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="zengjiashijianConfirm" ref="zengjiashijian" themeColor="#333333"></w-picker>
	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				yonghuzhanghao: '',
				yonghuxingming: '',
				jifen: '',
				zengjiashijian: '',
				zengjiashiyou: '',
				},
				// 登陆用户信息
				user: {},
                ro:{
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   jifen : false,
                   zengjiashijian : false,
                   zengjiashiyou : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
            this.ruleForm.zengjiashijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取



			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`jifenzengjia`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='yonghuzhanghao'){
					this.ruleForm.yonghuzhanghao = obj[o];
					this.ro.yonghuzhanghao = true;
					continue;
					}
					if(o=='yonghuxingming'){
					this.ruleForm.yonghuxingming = obj[o];
					this.ro.yonghuxingming = true;
					continue;
					}
					if(o=='jifen'){
					this.ruleForm.jifen = obj[o];
					this.ro.jifen = true;
					continue;
					}
					if(o=='zengjiashijian'){
					this.ruleForm.zengjiashijian = obj[o];
					this.ro.zengjiashijian = true;
					continue;
					}
					if(o=='zengjiashiyou'){
					this.ruleForm.zengjiashiyou = obj[o];
					this.ro.zengjiashiyou = true;
					continue;
					}
				}
            this.ruleForm.jifen = 0;
            this.ro.jifen = false;
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			zengjiashijianConfirm(val) {
				console.log(val)
				this.ruleForm.zengjiashijian = val.result;
				this.$forceUpdate();
			},



			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {











//跨表计算判断
				var obj;
				if((!this.ruleForm.jifen)){
					this.$utils.msg(`积分不能为空`);
					return
				}
				if(this.ruleForm.jifen&&(!this.$validate.isIntNumer(this.ruleForm.jifen))){
					this.$utils.msg(`积分应输入整数`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`jifenzengjia`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
                        if(!obj) {
                            obj = uni.getStorageSync('crossObj');
                        }
                        var table = uni.getStorageSync('crossTable');
                        obj.jifen = parseFloat(obj.jifen) + parseFloat(this.ruleForm.jifen)
                        await this.$api.update(`${table}`, obj);
						if(this.ruleForm.id){
							await this.$api.update(`jifenzengjia`, this.ruleForm);
						}else{
							await this.$api.add(`jifenzengjia`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
                    if(!obj) {
                        obj = uni.getStorageSync('crossObj');
                    }
                    var table = uni.getStorageSync('crossTable');
                    obj.jifen = parseFloat(obj.jifen) + parseFloat(this.ruleForm.jifen)
                    await this.$api.update(`${table}`, obj);
					if(this.ruleForm.id){
						await this.$api.update(`jifenzengjia`, this.ruleForm);
					}else{
						await this.$api.add(`jifenzengjia`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
