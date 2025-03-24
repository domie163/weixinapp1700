<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"0 0 240rpx","position":"relative","background":"url(http://codegen.caihongy.cn/20221220/59a732694b3248ee8e6b685b4b45dc29.png) fixed,#f6f6f6","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">项目编号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xiangmubianhao" v-model="ruleForm.xiangmubianhao" placeholder="项目编号"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">项目名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xiangmumingcheng" v-model="ruleForm.xiangmumingcheng" placeholder="项目名称"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">项目分类</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xiangmufenlei" v-model="ruleForm.xiangmufenlei" placeholder="项目分类"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="fengmiantupianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">封面图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.fengmiantupian" :src="baseUrl+ruleForm.fengmiantupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">代办金额</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.daibanjine" v-model="ruleForm.daibanjine" placeholder="代办金额"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">联系人</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.lianxiren" v-model="ruleForm.lianxiren" placeholder="联系人"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">联系方式</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.lianxifangshi" v-model="ruleForm.lianxifangshi" placeholder="联系方式"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">用户手机</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yonghushouji" v-model="ruleForm.yonghushouji" placeholder="用户手机"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">申请时间</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.shenqingshijian" placeholder="申请时间" @tap="toggleTab('shenqingshijian')"></input>
			</view>
			
			<!-- 否 -->
 

			
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","borderWidth":"0 0 0px 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#111","fontWeight":"500"}' class="title">申请内容</view>
                <xia-editor ref="editor" :style='{"minHeight":"300rpx","padding":"24rpx 40rpx","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","borderColor":"#e9be70","borderRadius":"10%","background":"rgba(255,255,255,1)","borderWidth":"8rpx 4rpx 2rpx","width":"100%","borderStyle":"solid","height":"auto"}' v-model="ruleForm.shenqingneirong" placeholder="申请内容" @editorChange="shenqingneirongChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","margin":"40rpx 0 0 0","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0 40rpx","boxShadow":"2rpx 4rpx 8rpx #ccc","margin":"0 40rpx 0 0","color":"#333","borderRadius":"16rpx","background":"linear-gradient(80deg, rgba(233,190,112,1) 0%, rgba(254,236,200,1) 21%, rgba(249,224,176,1) 50%, rgba(252,235,199,1) 84%, rgba(233,190,112,1) 100%),#e9be70","display":"inline","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="shenqingshijianConfirm" ref="shenqingshijian" themeColor="#333333"></w-picker>
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
				xiangmubianhao: '',
				xiangmumingcheng: '',
				xiangmufenlei: '',
				fengmiantupian: '',
				daibanjine: '',
				lianxiren: '',
				lianxifangshi: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				yonghushouji: '',
				shenqingneirong: '',
				shenqingshijian: '',
				},
				// 登陆用户信息
				user: {},
                ro:{
                   xiangmubianhao : false,
                   xiangmumingcheng : false,
                   xiangmufenlei : false,
                   fengmiantupian : false,
                   daibanjine : false,
                   lianxiren : false,
                   lianxifangshi : false,
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   yonghushouji : false,
                   shenqingneirong : false,
                   shenqingshijian : false,
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
            this.ruleForm.shenqingshijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;
			this.ruleForm.yonghushouji = this.user.yonghushouji
			this.ro.yonghushouji = true;



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
				res = await this.$api.info(`daibanshenqing`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='xiangmubianhao'){
					this.ruleForm.xiangmubianhao = obj[o];
					this.ro.xiangmubianhao = true;
					continue;
					}
					if(o=='xiangmumingcheng'){
					this.ruleForm.xiangmumingcheng = obj[o];
					this.ro.xiangmumingcheng = true;
					continue;
					}
					if(o=='xiangmufenlei'){
					this.ruleForm.xiangmufenlei = obj[o];
					this.ro.xiangmufenlei = true;
					continue;
					}
					if(o=='fengmiantupian'){
					this.ruleForm.fengmiantupian = obj[o].split(",")[0];
					this.ro.fengmiantupian = true;
					continue;
					}
					if(o=='daibanjine'){
					this.ruleForm.daibanjine = obj[o];
					this.ro.daibanjine = true;
					continue;
					}
					if(o=='lianxiren'){
					this.ruleForm.lianxiren = obj[o];
					this.ro.lianxiren = true;
					continue;
					}
					if(o=='lianxifangshi'){
					this.ruleForm.lianxifangshi = obj[o];
					this.ro.lianxifangshi = true;
					continue;
					}
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
					if(o=='yonghushouji'){
					this.ruleForm.yonghushouji = obj[o];
					this.ro.yonghushouji = true;
					continue;
					}
					if(o=='shenqingneirong'){
					this.ruleForm.shenqingneirong = obj[o];
					this.ro.shenqingneirong = true;
					continue;
					}
					if(o=='shenqingshijian'){
					this.ruleForm.shenqingshijian = obj[o];
					this.ro.shenqingshijian = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
            shenqingneirongChange(e) {
                this.ruleForm.shenqingneirong = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			shenqingshijianConfirm(val) {
				console.log(val)
				this.ruleForm.shenqingshijian = val.result;
				this.$forceUpdate();
			},


			fengmiantupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.fengmiantupian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {

























//跨表计算判断
				var obj;
				if(this.ruleForm.daibanjine&&(!this.$validate.isNumber(this.ruleForm.daibanjine))){
					this.$utils.msg(`代办金额应输入数字`);
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
					let res = await this.$api.list(`daibanshenqing`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`daibanshenqing`, this.ruleForm);
						}else{
							await this.$api.add(`daibanshenqing`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`daibanshenqing`, this.ruleForm);
					}else{
						await this.$api.add(`daibanshenqing`, this.ruleForm);
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
