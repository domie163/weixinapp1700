import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import xiangmufenlei from '@/views/modules/xiangmufenlei/list'
    import daikuanzhonglei from '@/views/modules/daikuanzhonglei/list'
    import discussdaikuanxinxi from '@/views/modules/discussdaikuanxinxi/list'
    import daikuanxinxi from '@/views/modules/daikuanxinxi/list'
    import daibanshenqing from '@/views/modules/daibanshenqing/list'
    import jifenduihuan from '@/views/modules/jifenduihuan/list'
    import storeup from '@/views/modules/storeup/list'
    import systemintro from '@/views/modules/systemintro/list'
    import daibanxiangmu from '@/views/modules/daibanxiangmu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jifenshangcheng from '@/views/modules/jifenshangcheng/list'
    import chat from '@/views/modules/chat/list'
    import daikuanshenqing from '@/views/modules/daikuanshenqing/list'
    import config from '@/views/modules/config/list'
    import jifenzengjia from '@/views/modules/jifenzengjia/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '金融资讯',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/xiangmufenlei',
        name: '项目分类',
        component: xiangmufenlei
      }
      ,{
	path: '/daikuanzhonglei',
        name: '贷款种类',
        component: daikuanzhonglei
      }
      ,{
	path: '/discussdaikuanxinxi',
        name: '贷款信息评论',
        component: discussdaikuanxinxi
      }
      ,{
	path: '/daikuanxinxi',
        name: '贷款信息',
        component: daikuanxinxi
      }
      ,{
	path: '/daibanshenqing',
        name: '代办申请',
        component: daibanshenqing
      }
      ,{
	path: '/jifenduihuan',
        name: '积分兑换',
        component: jifenduihuan
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/daibanxiangmu',
        name: '代办项目',
        component: daibanxiangmu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jifenshangcheng',
        name: '积分商城',
        component: jifenshangcheng
      }
      ,{
	path: '/chat',
        name: '咨询客服',
        component: chat
      }
      ,{
	path: '/daikuanshenqing',
        name: '贷款申请',
        component: daikuanshenqing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jifenzengjia',
        name: '积分增加',
        component: jifenzengjia
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
