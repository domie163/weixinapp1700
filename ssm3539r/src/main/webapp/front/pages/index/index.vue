<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0 0 0px","background":"url(http://codegen.caihongy.cn/20221220/59a732694b3248ee8e6b685b4b45dc29.png) fixed,#f6f6f6","height":"auto"}'>
		<swiper :style='{"padding":"0px 0 40rpx ","boxShadow":"inset 0px 0px 112rpx 0px #f4ead8","borderColor":"#e9be70","outline":"0px solid #bbb","margin":"0 auto 40rpx","borderRadius":"0 0 20% 20%","background":"rgba(255,255,255,1)","borderWidth":"0 16rpx 8rpx 16rpx","width":"calc(100% - 40rpx)","borderStyle":"solid","height":"380rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
			<swiper-item :style='{"width":"calc(100% - 0px)","margin":"0 auto","position":"relative","borderRadius":"0px 0px 10% 10%","background":"none","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"calc(100% - 40rpx)","margin":"0 auto","objectFit":"cover","borderRadius":"0 0 20% 20%","display":"block","height":"360rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"padding":"0 20rpx 32rpx","color":"#333","left":"20rpx","textAlign":"center","background":"rgba(255,255,255,.6)","bottom":"0px","width":"calc(100% - 40rpx)","lineHeight":"60rpx","fontSize":"28rpx","position":"absolute"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"20rpx 0 20rpx","boxShadow":"inset 0px 0px 112rpx 0px #f4ead8","margin":"40rpx auto 80rpx","borderColor":"#e9be70","display":"flex","outline":"0px solid #ccc","borderRadius":"20%","flexWrap":"wrap","background":"rgba(255,255,255,1)","borderWidth":"20rpx 16rpx 8rpx 16rpx","width":"calc(100% - 40rpx)","borderStyle":"solid","height":"auto"}'>
            <block v-for="item in menuList" v-bind:key="item.roleName">
                <block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
                    <block v-bind:key="sort" v-for=" (child,sort) in menu.child">
                        <block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
                            <view :style='{"width":"25%","padding":"12rpx 0","margin":"10rpx 0","height":"auto"}' class="menu-list" v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2('../'+child.tableName+'/list')">
                                <view class="iconarr" :class="child.appFrontIcon" :style='{"padding":"0","margin":"0px auto","color":"#333","borderRadius":"100%","background":"none","display":"block","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","height":"64rpx"}'></view>
                                <view :style='{"padding":"0","margin":"12rpx auto 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{child.menu.split("列表")[0]}}</view>
                            </view>
                        </block>
                    </block>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		
		<!-- 系统简介 -->
		<view :style='{"padding":"0px","boxShadow":"0 0px 0px rgba(0,0,0,.2)","margin":"40rpx 20rpx 40rpx 20rpx","borderRadius":"24rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 40rpx)","justifyContent":"center","height":"auto"}'>
		  <view :style='{"padding":"0 20rpx","margin":"0","color":"#333","borderRadius":"8rpx 16rpx 16rpx 8rpx","textAlign":"center","background":"#e9be70","width":"auto","lineHeight":"72rpx","fontSize":"36rpx"}'>{{systemIntroductionDetail.title}}</view>
		  <view :style='{"padding":"4rpx 40rpx 0 20rpx","margin":"12rpx 0 0","color":"#555","borderRadius":"0 24rpx 24rpx 0","textAlign":"center","background":"#e9be70","width":"auto","fontSize":"28rpx","height":"48rpx"}'>{{systemIntroductionDetail.subtitle}}</view>
		  <view :style='{"padding":"0px","margin":"60rpx 0 0 0","background":"none","display":"flex","width":"100%","position":"relative","justifyContent":"center","height":"auto"}'>
		    <img :style='{"padding":"24rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","objectFit":"cover","display":"block","borderRadius":"10%","left":"16rpx","borderWidth":"8rpx 4rpx 4rpx 4rpx","width":"30%","position":"absolute","borderStyle":"solid","height":"400rpx"}' v-if="systemIntroductionDetail.picture1" :src="baseUrl+systemIntroductionDetail.picture1">
		    <img :style='{"padding":"24rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","objectFit":"cover","borderRadius":"10%","borderWidth":"8rpx 4rpx 4rpx 4rpx","display":"block","width":"40%","borderStyle":"solid","height":"400rpx"}' v-if="systemIntroductionDetail.picture2" :src="baseUrl+systemIntroductionDetail.picture2">
		    <img :style='{"padding":"24rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","objectFit":"cover","display":"block","right":"12rpx","borderRadius":"10%","borderWidth":"8rpx 4rpx 4rpx 4rpx","width":"30%","position":"absolute","borderStyle":"solid","height":"400rpx"}' v-if="systemIntroductionDetail.picture3" :src="baseUrl+systemIntroductionDetail.picture3">
		  </view>
		  <view :style='{"border":"4rpx dotted #f7de91","padding":"20rpx","boxShadow":"inset 0px 0px 112rpx 0px #f4ead8","margin":"40rpx 0 20rpx 0","borderColor":"#e9be70","color":"rgb(102, 102, 102)","textIndent":"2em","minHeight":"336rpx","borderRadius":"10%","background":"rgba(255,255,255,1)","borderWidth":"8rpx 4rpx 4rpx 4rpx","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","borderStyle":"solid"}' v-html="systemIntroductionDetail.content"></view>
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		</view>

		<!-- 新闻资讯 -->
																																																						<view class="listBox news">
			<view v-if="false && 1 == 1" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"padding":"4rpx 0","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"0 auto 40rpx","borderRadius":"0 24rpx 24rpx 0","background":"#e9be70","display":"flex","width":"calc(100% - 40rpx)","justifyContent":"space-between","height":"48rpx"}'>
				<view :style='{"padding":"0 48rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"-20rpx 0 0","color":"#111","borderRadius":"8rpx 24rpx 24rpx 8rpx","background":"#e9be70","display":"inline-block","width":"auto","fontSize":"32rpx","lineHeight":"80rpx","height":"80rpx"}'>金融资讯</view>
				<text :style='{"padding":"0 40rpx","margin":"0px 0px 0 0","fontSize":"28rpx","lineHeight":"40rpx","color":"#555","background":"none"}' @tap="onPageTap('news')">查看更多</text>
			</view>
			
			<view v-if="false && 1 == 2" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
					  
						
						
		  <!-- 样式4 -->
		  		  
		  <!-- 样式5 -->
		  		  
		  <!-- 样式6 -->
		  		  
		  <!-- 样式7 -->
		  		  
		  <!-- 样式8 -->
		  		  <view class="news-box5" :style='{"padding":"24rpx","margin":"0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"boxShadow":"inset 0px 0px 112rpx 0px #f1d8aa","margin":"0 0 40rpx","backgroundColor":"#fff","borderColor":"#e9be70","borderRadius":"10%","borderWidth":"8rpx 4rpx 2rpx","width":"100%","borderStyle":"solid","height":"auto"}'>
			  <view :style='{"padding":"8rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","fontWeight":"600"}' class="title ">{{item.title}}</view>
			  <view :style='{"padding":"4rpx 20rpx","overflow":"hidden","color":"#666","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textIndent":"2em","height":"96rpx"}' class="category ">{{item.introduction}}</view>
			  <view :style='{"width":"100%","padding":"16rpx 20rpx","lineHeight":"1.5","fontSize":"28rpx","color":"#999","textAlign":"right"}' class="time ">{{item.addtime.split(" ")[0]}}</view>
			</view>
		  </view>
		  		  
		  <!-- 样式9 -->
		  			
			<view v-if="false && 1 == 3" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																		<!-- 新闻资讯 -->
				

		<!-- 商品列表 -->
																														<view class="listBox list">
			<view v-if="false && 1 == 1" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"padding":"4rpx 0","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"0 auto 40rpx","borderRadius":"0 24rpx 24rpx 0","background":"#e9be70","display":"flex","width":"calc(100% - 40rpx)","justifyContent":"space-between","height":"48rpx"}'>
				<view :style='{"padding":"0 48rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"-20rpx 0 0","color":"#111","borderRadius":"8rpx 24rpx 24rpx 8rpx","background":"#e9be70","display":"inline-block","width":"auto","fontSize":"32rpx","lineHeight":"80rpx","height":"80rpx"}'>积分商城</view>
				<text :style='{"padding":"0 40rpx","margin":"0px 0px 0 0","fontSize":"28rpx","color":"#555","background":"none"}' @tap="onPageTap('jifenshangcheng')">查看更多</text>
			</view>
			
			<view v-if="false && 1 == 2" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  <!-- 样式8 -->
		  <view class="list-box style8" :style='{"width":"100%","padding":"24rpx","margin":"0","height":"auto"}'>
			<view v-if="homejifenshangchenglist.length > 0" @tap="onDetailTap('jifenshangcheng',homejifenshangchenglist[0].id)" class="box box1" :style='{"padding":"20rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0 0 20rpx","borderColor":"#e9be70","borderRadius":"10%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","width":"100%","position":"relative","borderStyle":"solid","height":"auto"}'>
			  			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">{{homejifenshangchenglist[0].shangpinmingcheng}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-if="homejifenshangchenglist[0].shangpintupian.substring(0,4)=='http'" :src="homejifenshangchenglist[0].shangpintupian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"270rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejifenshangchenglist[0].shangpintupian?baseUrl+homejifenshangchenglist[0].shangpintupian.split(',')[0]:''"></image>
			                			  			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">兑换积分:{{homejifenshangchenglist[0].duihuanjifen}}</view>
			  			  			                			  			                			  			</view>
			<view class="list-item" :style='{"width":"100%","padding":"0","margin":"0 0 20rpx","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view v-if="homejifenshangchenglist.length > 1" @tap="onDetailTap('jifenshangcheng',homejifenshangchenglist[1].id)" class="box box2" :style='{"padding":"8rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","borderRadius":"10%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","width":"32%","position":"relative","borderStyle":"solid","height":"auto"}'>
								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">{{homejifenshangchenglist[1].shangpinmingcheng}}</view>
																<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="homejifenshangchenglist[1].shangpintupian.substring(0,4)=='http'" :src="homejifenshangchenglist[1].shangpintupian"></image>
				<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejifenshangchenglist[1].shangpintupian?baseUrl+homejifenshangchenglist[1].shangpintupian.split(',')[0]:''"></image>
				                								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">兑换积分:{{homejifenshangchenglist[1].duihuanjifen}}</view>
												                								                							  </view>
			  <view v-if="homejifenshangchenglist.length > 2" @tap="onDetailTap('jifenshangcheng',homejifenshangchenglist[2].id)" class="box box3" :style='{"padding":"8rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","borderRadius":"10%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","width":"32%","position":"relative","borderStyle":"solid","height":"auto"}'>
								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">{{homejifenshangchenglist[2].shangpinmingcheng}}</view>
																<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="homejifenshangchenglist[2].shangpintupian.substring(0,4)=='http'" :src="homejifenshangchenglist[2].shangpintupian"></image>
				<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejifenshangchenglist[2].shangpintupian?baseUrl+homejifenshangchenglist[2].shangpintupian.split(',')[0]:''"></image>
				                								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">兑换积分:{{homejifenshangchenglist[2].duihuanjifen}}</view>
												                								                							  </view>
			  <view v-if="homejifenshangchenglist.length > 3" @tap="onDetailTap('jifenshangcheng',homejifenshangchenglist[3].id)" class="box box4" :style='{"padding":"8rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","borderRadius":"10%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","width":"32%","position":"relative","borderStyle":"solid","height":"auto"}'>
								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">{{homejifenshangchenglist[3].shangpinmingcheng}}</view>
																<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="homejifenshangchenglist[3].shangpintupian.substring(0,4)=='http'" :src="homejifenshangchenglist[3].shangpintupian"></image>
				<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejifenshangchenglist[3].shangpintupian?baseUrl+homejifenshangchenglist[3].shangpintupian.split(',')[0]:''"></image>
				                								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">兑换积分:{{homejifenshangchenglist[3].duihuanjifen}}</view>
												                								                							  </view>
			</view>
			<view class="list-item" :style='{"width":"100%","padding":"0","margin":"0","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view v-if="homejifenshangchenglist.length > 4" @tap="onDetailTap('jifenshangcheng',homejifenshangchenglist[4].id)" class="box box5" :style='{"padding":"16rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","borderRadius":"10%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","width":"48%","position":"relative","borderStyle":"solid","height":"auto"}'>
								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"56rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">{{homejifenshangchenglist[4].shangpinmingcheng}}</view>
																<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejifenshangchenglist[4].shangpintupian.substring(0,4)=='http'" :src="homejifenshangchenglist[4].shangpintupian"></image>
				<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejifenshangchenglist[4].shangpintupian?baseUrl+homejifenshangchenglist[4].shangpintupian.split(',')[0]:''"></image>
				                								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"56rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">兑换积分:{{homejifenshangchenglist[4].duihuanjifen}}</view>
												                								                							  </view>
			  <view v-if="homejifenshangchenglist.length > 5" @tap="onDetailTap('jifenshangcheng',homejifenshangchenglist[5].id)" class="box box6" :style='{"padding":"16rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","borderRadius":"10%","borderWidth":"8rpx 4rpx 2rpx","background":"rgba(255,255,255,1)","width":"48%","position":"relative","borderStyle":"solid","height":"auto"}'>
								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"56rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">{{homejifenshangchenglist[5].shangpinmingcheng}}</view>
																<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejifenshangchenglist[5].shangpintupian.substring(0,4)=='http'" :src="homejifenshangchenglist[5].shangpintupian"></image>
				<image :style='{"width":"100%","objectFit":"cover","borderRadius":"10%","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejifenshangchenglist[5].shangpintupian?baseUrl+homejifenshangchenglist[5].shangpintupian.split(',')[0]:''"></image>
				                								                								                				<view v-if="true" :style='{"padding":"0 20rpx","margin":"8rpx 0 8rpx","color":"#333","borderRadius":"20%","textAlign":"center","background":"linear-gradient(60deg, rgba(233,190,112,1) 0%, rgba(255,248,234,1) 50%, rgba(233,190,112,1) 100%),#e9be70","width":"100%","lineHeight":"56rpx","fontSize":"28rpx","zIndex":"1"}' class="title ">兑换积分:{{homejifenshangchenglist[5].duihuanjifen}}</view>
												                								                							  </view>
			</view>
		  </view>
		  		  
		  		  
			<view v-if="false && 1 == 3" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																										<!-- 商品列表 -->
		
		
		<!-- 关于我们 -->
		<view :style='{"padding":"24rpx 24rpx 60rpx","boxShadow":"0 0px 0px rgba(0,0,0,0)","margin":"0","borderRadius":"0px","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","position":"relative","justifyContent":"center","height":"auto"}'>
		  <view :style='{"padding":"0 20rpx","margin":"0","color":"#111","borderRadius":"8rpx 16rpx 16rpx 8rpx","textAlign":"center","background":"#e9be70","width":"auto","lineHeight":"72rpx","fontSize":"36rpx"}'>{{aboutUsDetail.title}}</view>
		  <view :style='{"padding":"4rpx 40rpx 0 20rpx","margin":"12rpx 0 0","color":"#555","borderRadius":"0 24rpx 24rpx 0","textAlign":"center","background":"#e9be70","display":"block","width":"auto","fontSize":"28rpx","height":"48rpx"}'>{{aboutUsDetail.subtitle}}</view>
		  <view :style='{"border":"0px double #ffeeba","padding":"0px","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"48rpx 0 0 -20rpx","display":"flex","float":"right","justifyContent":"space-between","borderRadius":"0","flexWrap":"wrap","background":"none","width":"32%","height":"auto","order":"1"}'>
		    <img :style='{"padding":"16rpx 16rpx 16rpx 24rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","objectFit":"cover","borderRadius":"10%","borderWidth":"8rpx 4rpx 4rpx","display":"inline-block","width":"100%","borderStyle":"solid","height":"392rpx"}' v-if="aboutUsDetail.picture1" :src="baseUrl+aboutUsDetail.picture1">
		    <img :style='{"border":"0px dotted #f7de91","padding":"0px","margin":"0px","objectFit":"cover","borderRadius":"16rpx","display":"none","width":"48%","height":"160rpx"}' v-if="aboutUsDetail.picture2" :src="baseUrl+aboutUsDetail.picture2">
		    <img :style='{"width":"48%","margin":"0px","objectFit":"cover","borderRadius":"16rpx","display":"none","height":"160rpx"}' v-if="aboutUsDetail.picture3" :src="baseUrl+aboutUsDetail.picture3">
		  </view>
		  <view :style='{"padding":"16rpx","boxShadow":"inset 0px 0px 112rpx 0px #f4ead8","margin":"48rpx 0px 0 0","borderColor":"#e9be70","color":"rgb(102, 102, 102)","textIndent":"2em","float":"left","borderRadius":"10%","background":"rgba(255,255,255,1)","borderWidth":"8rpx 4rpx 4rpx","width":"68%","lineHeight":"48rpx","fontSize":"28rpx","borderStyle":"solid","height":"392rpx"}' v-html="aboutUsDetail.content"></view>
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		</view>

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
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
                role : '',
                aboutUsDetail: {},
                systemIntroductionDetail: {},
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				homejifenshangchenglist: [],
				news: [],
			}
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
            this.menuList.forEach((item,key) => {
                if(this.role==item.roleName) {
                    item.frontMenu.forEach((item2,key2) => {
                        if(item2.child[0].buttons.indexOf("查看")>-1) {
                            this.swiperMenuList.push(item2);
                        }
                    })
                }
            })
        },
		async onShow() {
			// 轮播图
			let swiperList = []
			let res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
            this.getAboutUs();
            this.getSystemIntroduction();
			// 金融资讯
			res = await this.$api.list('news', {
				page: 1,
				limit: 6
			});
			this.news = res.data.list


			res = await this.$api.list('jifenshangcheng', {
				page: 1,

				limit: 6
			});
			this.homejifenshangchenglist = res.data.list
		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
            async getAboutUs() {
                let res = await this.$api.info('aboutus', 1)
                this.aboutUsDetail = res.data;
            },
            async getSystemIntroduction() {
                let res = await this.$api.info('systemintro', 1)
                this.systemIntroductionDetail = res.data;
            },
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
            onPageTap2(url) {
                uni.setStorageSync("useridTag",0);
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
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
