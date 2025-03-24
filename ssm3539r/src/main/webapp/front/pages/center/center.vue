<template>
	<view class="content">
		<view :style='{"minHeight":"100vh","width":"100%","padding":"40rpx 0 240rpx","position":"relative","background":"url(http://codegen.caihongy.cn/20221220/59a732694b3248ee8e6b685b4b45dc29.png) fixed,#f6f6f6","height":"auto"}'>
			<view :style='{"padding":"0px 24rpx","boxShadow":"inset 0px 0px 112rpx 0px #f7dcab","margin":"0px auto 40rpx","borderColor":"#e9be70","borderRadius":"20%","background":"rgba(255,255,255,1)","borderWidth":"20rpx 16rpx 8rpx 16rpx","display":"flex","width":"calc(100% - 40rpx)","borderStyle":"solid","height":"280rpx"}' @tap="onPageTap('../user-info/user-info')" class="header" v-bind:class="{'status':isH5Plus}">
				<view :style='{"width":"calc(100% - 112rpx)","alignItems":"center","display":"flex","height":"100%"}' v-if="tableName=='yonghu'" class="userinfo">
					<image :style='{"width":"88rpx","padding":"0","margin":"0 20rpx 0 0","borderRadius":"100%","height":"88rpx"}' :src="user.touxiang?baseUrl+user.touxiang:'/static/gen/upload.png'"></image>
					<view :style='{"width":"100%","flex":"1","flexDirection":"column","justifyContent":"center","display":"flex","height":"100%"}' class="info">
						<view :style='{"width":"100%","lineHeight":"36rpx","fontSize":"24rpx","color":"#333"}'>{{user.yonghuzhanghao}}<text v-if="user.vip&& user.vip=='是'">(VIP)</text></view>
					</view>
				</view>
				<view :style='{"width":"112rpx","alignItems":"center","justifyContent":"center","display":"flex","height":"100%"}' class="setting">
					<view :style='{"border":"0","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"#333","borderRadius":"0"}' class="cuIcon-settings"></view>
				</view>
			</view>
		
		
			<view :style='{"padding":"0 24rpx 160rpx","margin":"0 24rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 48rpx)","height":"auto"}' class="list">

				<block v-for="item in menuList" v-bind:key="item.roleName">
					<block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.backMenu">
						<block v-bind:key="sort" v-for=" (child,sort) in menu.child">
							<view :style='{"padding":"0 20rpx","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","borderColor":"#e9be70","margin":"0 0 20rpx","alignItems":"center","display":"flex","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","width":"100%","lineHeight":"80rpx","borderStyle":"solid","height":"auto"}' v-if="child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' && child.tableName!='exampaper' && child.tableName!='examquestion' " @tap="onPageTap('../'+child.tableName+'/list?userid='+user.id)" class="li" hover-class="hover">
								<view v-if="true" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"#e9be70"}' :class="child.appFrontIcon"></view>
								<view :style='{"width":"100%","padding":"0 20rpx","lineHeight":"88rpx","fontSize":"28rpx","color":"#333","flex":"1"}' class="text">{{child.menu}}</view>
								<view v-if="true" :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"28rpx","color":"#333"}' class="cuIcon-right"></view>
							</view>
						</block>
					</block>
				</block>

				<view @tap="onPageTap('../chat/chat')" :style='{"padding":"0 20rpx","boxShadow":"inset 0px 0px 64rpx 0px #f9edd9","borderColor":"#e9be70","margin":"0 0 20rpx","alignItems":"center","display":"flex","borderRadius":"20%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","width":"100%","lineHeight":"80rpx","borderStyle":"solid","height":"auto"}' class="li" hover-class="hover">
					<view v-if="true" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"#e9be70"}' class="cuIcon-service"></view>
					<view class="text" :style='{"width":"100%","padding":"0 20rpx","lineHeight":"88rpx","fontSize":"28rpx","color":"#333","flex":"1"}'>咨询客服</view>
					<view v-if="true" :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"28rpx","color":"#333"}' class="cuIcon-right"></view>
				</view>

			</view>
		</view>
	</view>
</template>
<script>
	import menu from '@/utils/menu'
	export default {
		data() {
			return {
				isH5Plus: true,
				user: {},
				tableName:'',
				role: '',
				menuList: [],
        iconArr: [
          'cuIcon-same',
          'cuIcon-deliver',
          'cuIcon-evaluate',
          'cuIcon-shop',
          'cuIcon-ticket',
          'cuIcon-cascades',
          'cuIcon-discover',
          'cuIcon-question',
          'cuIcon-pic',
          'cuIcon-filter',
          'cuIcon-footprint',
          'cuIcon-pulldown',
          'cuIcon-pullup',
          'cuIcon-moreandroid',
          'cuIcon-refund',
          'cuIcon-qrcode',
          'cuIcon-remind',
          'cuIcon-profile',
          'cuIcon-home',
          'cuIcon-message',
          'cuIcon-link',
          'cuIcon-lock',
          'cuIcon-unlock',
          'cuIcon-vip',
          'cuIcon-weibo',
          'cuIcon-activity',
          'cuIcon-friendadd',
          'cuIcon-friendfamous',
          'cuIcon-friend',
          'cuIcon-goods',
          'cuIcon-selection'
        ],
			};
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad(){
			this.role = uni.getStorageSync("role");
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
		},
		async onShow(){
            uni.removeStorageSync("useridTag");
			this.role = uni.getStorageSync("role");
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
		},
		methods: {
			onPageTap(url) {
                uni.setStorageSync("useridTag",1);
				uni.navigateTo({
					url: url,
					fail: function() {
						uni.switchTab({
							url: url
						});
					}
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		height: calc(100vh - 94px);
		box-sizing: border-box;
	}
</style>
