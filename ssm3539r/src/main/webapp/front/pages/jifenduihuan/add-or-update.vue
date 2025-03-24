<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"0 0 240rpx","position":"relative","background":"url(http://codegen.caihongy.cn/20221220/59a732694b3248ee8e6b685b4b45dc29.png) fixed,#f6f6f6","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">兑换编号</view>
				<view :style='{"padding":"0px 24rpx","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"#666","flex":"1"}' class="right-input">
					{{ruleForm.duihuanbianhao}}
				</view>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">商品名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shangpinmingcheng" v-model="ruleForm.shangpinmingcheng" placeholder="商品名称"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="shangpintupianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">商品图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.shangpintupian" :src="baseUrl+ruleForm.shangpintupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">兑换积分</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.duihuanjifen" v-model="ruleForm.duihuanjifen" placeholder="兑换积分"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">兑换数量</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.duihuanshuliang" v-model="ruleForm.duihuanshuliang" placeholder="兑换数量"></input>
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
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">积分</view>
				<view :style='{"padding":"0px 24rpx","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"#666","flex":"1"}' class="right-input">
					{{jifen}}
				</view>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">兑换时间</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' mode="date" :value="ruleForm.duihuanshijian" @change="duihuanshijianChange">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.duihuanshijian?ruleForm.duihuanshijian:"请选择兑换时间"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">兑换备注</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.duihuanbeizhu" v-model="ruleForm.duihuanbeizhu" placeholder="兑换备注"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">收货地址</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shouhuodizhi" v-model="ruleForm.shouhuodizhi" placeholder="收货地址"></input>
			</view>
			
			<!-- 否 -->
 

			
			
			<view :style='{"width":"100%","margin":"40rpx 0 0 0","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0 40rpx","boxShadow":"2rpx 4rpx 8rpx #ccc","margin":"0 40rpx 0 0","color":"#333","borderRadius":"16rpx","background":"linear-gradient(80deg, rgba(233,190,112,1) 0%, rgba(254,236,200,1) 21%, rgba(249,224,176,1) 50%, rgba(252,235,199,1) 84%, rgba(233,190,112,1) 100%),#e9be70","display":"inline","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

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
				duihuanbianhao: this.getUUID(),
				shangpinmingcheng: '',
				shangpintupian: '',
				duihuanjifen: '',
				duihuanshuliang: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				jifen: '',
				duihuanshijian: '',
				duihuanbeizhu: '',
				shouhuodizhi: '',
				},
				// 登陆用户信息
				user: {},
                ro:{
                   duihuanbianhao : false,
                   shangpinmingcheng : false,
                   shangpintupian : false,
                   duihuanjifen : false,
                   duihuanshuliang : false,
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   jifen : false,
                   duihuanshijian : false,
                   duihuanbeizhu : false,
                   shouhuodizhi : false,
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


			jifen:{
			get: function () {
				return 1*this.ruleForm.duihuanjifen*this.ruleForm.duihuanshuliang
			}
			},

		},
		async onLoad(options) {
            this.ruleForm.duihuanshijian = this.$utils.getCurDate();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;
			this.ruleForm.jifen = this.user.jifen
			this.ro.jifen = true;



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
				res = await this.$api.info(`jifenduihuan`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='duihuanbianhao'){
					this.ruleForm.duihuanbianhao = obj[o];
					this.ro.duihuanbianhao = true;
					continue;
					}
					if(o=='shangpinmingcheng'){
					this.ruleForm.shangpinmingcheng = obj[o];
					this.ro.shangpinmingcheng = true;
					continue;
					}
					if(o=='shangpintupian'){
					this.ruleForm.shangpintupian = obj[o].split(",")[0];
					this.ro.shangpintupian = true;
					continue;
					}
					if(o=='duihuanjifen'){
					this.ruleForm.duihuanjifen = obj[o];
					this.ro.duihuanjifen = true;
					continue;
					}
					if(o=='duihuanshuliang'){
					this.ruleForm.duihuanshuliang = obj[o];
					this.ro.duihuanshuliang = true;
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
					if(o=='jifen'){
					this.ruleForm.jifen = obj[o];
					this.ro.jifen = true;
					continue;
					}
					if(o=='duihuanshijian'){
					this.ruleForm.duihuanshijian = obj[o];
					this.ro.duihuanshijian = true;
					continue;
					}
					if(o=='duihuanbeizhu'){
					this.ruleForm.duihuanbeizhu = obj[o];
					this.ro.duihuanbeizhu = true;
					continue;
					}
					if(o=='shouhuodizhi'){
					this.ruleForm.shouhuodizhi = obj[o];
					this.ro.shouhuodizhi = true;
					continue;
					}
				}
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

			duihuanshijianChange(e) {
				this.ruleForm.duihuanshijian = e.target.value;
				this.$forceUpdate();
			},



			shangpintupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.shangpintupian = 'upload/' + res.file;
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

				this.ruleForm.jifen = this.jifen






















				if(Number(this.ruleForm.duihuanjifen)>Number(this.ruleForm.jifen)){
					this.$utils.msg(`兑换积分不能超过积分`);
					return
				}
//跨表计算判断
				var obj;
				if((!this.ruleForm.shangpinmingcheng)){
					this.$utils.msg(`商品名称不能为空`);
					return
				}
				if(this.ruleForm.duihuanjifen&&(!this.$validate.isIntNumer(this.ruleForm.duihuanjifen))){
					this.$utils.msg(`兑换积分应输入整数`);
					return
				}
				if(this.ruleForm.duihuanshuliang&&(!this.$validate.isIntNumer(this.ruleForm.duihuanshuliang))){
					this.$utils.msg(`兑换数量应输入整数`);
					return
				}
				if(this.ruleForm.jifen&&(!this.$validate.isIntNumer(this.ruleForm.jifen))){
					this.$utils.msg(`积分应输入整数`);
					return
				}
				if((!this.ruleForm.shouhuodizhi)){
					this.$utils.msg(`收货地址不能为空`);
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
					let res = await this.$api.list(`jifenduihuan`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`jifenduihuan`, this.ruleForm);
						}else{
							await this.$api.add(`jifenduihuan`, this.ruleForm);
                         if(this.user.jifen>=0) {
                             this.user.jifen = parseFloat(this.user.jifen) - parseFloat(this.ruleForm.jifen)
                             await this.$api.update(uni.getStorageSync("nowTable"), this.user);
                         }
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`jifenduihuan`, this.ruleForm);
					}else{
						await this.$api.add(`jifenduihuan`, this.ruleForm);
                         if(this.user.jifen>=0) {
                             this.user.jifen = parseFloat(this.user.jifen) - parseFloat(this.ruleForm.jifen)
                             await this.$api.update(uni.getStorageSync("nowTable"), this.user);
                         }
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
