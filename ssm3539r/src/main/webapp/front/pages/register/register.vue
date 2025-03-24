<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"360rpx 80rpx 80rpx","background":"url(http://codegen.caihongy.cn/20221220/6f0701a5cb3048b0b4ba43fdc1eaae65.jpg) no-repeat center top / 100% auto,#fff","height":"100%"}'>
		<view :style='{"padding":"60rpx 40rpx","boxShadow":"2rpx 4rpx 16rpx #ddd","borderRadius":"12rpx","background":"#fff","display":"block","width":"100%","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","margin":"0px","borderColor":"#e9be70","color":"rgb(0, 0, 0)","borderRadius":"12rpx","background":"rgb(255, 255, 255)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.yonghuzhanghao"  type="text"  class="uni-input" name="" placeholder="用户账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","margin":"0px","borderColor":"#e9be70","color":"rgb(0, 0, 0)","borderRadius":"12rpx","background":"rgb(255, 255, 255)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","margin":"0px","borderColor":"#e9be70","color":"rgb(0, 0, 0)","borderRadius":"12rpx","background":"rgb(255, 255, 255)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","margin":"0px","borderColor":"#e9be70","color":"rgb(0, 0, 0)","borderRadius":"12rpx","background":"rgb(255, 255, 255)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.yonghuxingming"  type="text"  class="uni-input" name="" placeholder="用户姓名" />
			</view>
			<picker :style='{"margin":"24rpx 0 24rpx 0","borderColor":"#e9be70","borderRadius":"12rpx","background":"#fff","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#767676"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","margin":"0px","borderColor":"#e9be70","color":"rgb(0, 0, 0)","borderRadius":"12rpx","background":"rgb(255, 255, 255)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.nianling"  type="text"  class="uni-input" name="" placeholder="年龄" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"border":"2rpx solid #e9be70","padding":"8rpx","borderRadius":"16rpx","objectFit":"cover","display":"block","width":"200rpx","height":"160rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"border":"2rpx solid #e9be70","padding":"8rpx","borderRadius":"16rpx","objectFit":"cover","display":"block","width":"200rpx","height":"160rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","margin":"0px","borderColor":"#e9be70","color":"rgb(0, 0, 0)","borderRadius":"12rpx","background":"rgb(255, 255, 255)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.yonghushouji"  type="text"  class="uni-input" name="" placeholder="用户手机" />
			</view>
			<button :style='{"border":"0","padding":"0px","margin":"24rpx 0 24rpx 0","color":"#fff","borderRadius":"12rpx","background":"#e9be70","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
				ruleForm: {
                yonghuzhanghao: '',
                mima: '',
                yonghuxingming: '',
                xingbie: '',
                nianling: '',
                touxiang: '',
                yonghushouji: '',
                jifen: '100',
				},
				tableName:""
			}
		},
        computed: {
            baseUrl() {
                return this.$base.url;
            }
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
            if(`yonghu` == this.tableName){
                this.ruleForm.jifen='100'
            }
			
			this.styleChange()
		},
		methods: {

            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
                    _this.$forceUpdate();
                });
            },
            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if(`yonghu` == this.tableName && this.ruleForm.yonghushouji&&(!this.$validate.isMobile(this.ruleForm.yonghushouji))){
					this.$utils.msg(`用户手机应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.jifen&&(!this.$validate.isIntNumer(this.ruleForm.jifen))){
					this.$utils.msg(`积分应输入整数`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
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
