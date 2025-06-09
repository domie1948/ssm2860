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
    import jijiandingdan from '@/views/modules/jijiandingdan/list'
    import jiesuan from '@/views/modules/jiesuan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhandianxinxi from '@/views/modules/zhandianxinxi/list'
    import peisongxinxi from '@/views/modules/peisongxinxi/list'
    import cangku from '@/views/modules/cangku/list'
    import wuliuxinxi from '@/views/modules/wuliuxinxi/list'
    import peisongyuan from '@/views/modules/peisongyuan/list'
    import peisongyuanbaoxiao from '@/views/modules/peisongyuanbaoxiao/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
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
	path: '/jijiandingdan',
        name: '寄件订单',
        component: jijiandingdan
      }
      ,{
	path: '/jiesuan',
        name: '结算',
        component: jiesuan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/zhandianxinxi',
        name: '站点信息',
        component: zhandianxinxi
      }
      ,{
	path: '/peisongxinxi',
        name: '配送信息',
        component: peisongxinxi
      }
      ,{
	path: '/cangku',
        name: '仓库',
        component: cangku
      }
      ,{
	path: '/wuliuxinxi',
        name: '物流信息',
        component: wuliuxinxi
      }
      ,{
	path: '/peisongyuan',
        name: '配送员',
        component: peisongyuan
      }
      ,{
	path: '/peisongyuanbaoxiao',
        name: '配送员报销',
        component: peisongyuanbaoxiao
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
    name: '首页',
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

export default router;
