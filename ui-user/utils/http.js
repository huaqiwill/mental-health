/**
 * API接口封装
 * 基于request.js的HTTP接口统一管理
 */

// import request from './request';
// import config from './config';

// // API接口路径定义
// const API = {
//   user: {
//     login: '/user/login',
//     register: '/user/register',
//     info: '/user/info',
//     update: '/user/update'
//   },
//   counselor: {
//     list: '/counselors',
//     detail: '/counselor/detail',
//     availableTime: '/counselor/available-time'
//   },
//   course: {
//     list: '/course/list',
//     detail: '/course/detail',
//     myCourses: '/course/my-courses'
//   },
//   order: {
//     create: '/order/create',
//     pay: '/order/pay',
//     list: '/order/list',
//     detail: '/order/detail'
//   },
//   common: {
//     upload: '/common/upload',
//     feedback: '/common/feedback'
//   }
// };

// /**
//  * 用户登录
//  * @param {Object} data 登录参数 {username, password}
//  * @returns {Promise} 登录结果
//  */
// export function login(data) {
//   return request({
//     url: API.user.login,
//     method: 'POST',
//     data
//   }).then(res => {
//     // 登录成功后设置token
//     if (res.accessToken) {
//       request.setToken(res.accessToken);
//       uni.setStorageSync(config.storage.refreshTokenKey, res.refreshToken);
//       uni.setStorageSync(config.storage.userInfoKey, res.userInfo || {});
//     }
//     return res;
//   });
// }

// /**
//  * 用户注册
//  * @param {Object} data 注册参数 {username, password, nickname, phone, code}
//  * @returns {Promise} 注册结果
//  */
// export function register(data) {
//   return request({
//     url: API.user.register,
//     method: 'POST',
//     data
//   });
// }

// /**
//  * 获取用户信息
//  * @returns {Promise} 用户信息
//  */
// export function getUserInfo() {
//   return request({
//     url: API.user.info,
//     method: 'GET'
//   });
// }

// /**
//  * 更新用户信息
//  * @param {Object} data 用户信息 {nickname, avatar, gender, age, ...}
//  * @returns {Promise} 更新结果
//  */
// export function updateUserInfo(data) {
//   return request({
//     url: API.user.update,
//     method: 'PUT',
//     data
//   });
// }

// /**
//  * 获取咨询师列表
//  * @param {Object} params 查询参数 {keyword, category, page, pageSize, ...}
//  * @returns {Promise} 咨询师列表
//  */
// export function getCounselorList(params) {
//   return request({
//     url: API.counselor.list,
//     method: 'GET',
//     params
//   });
// }

// /**
//  * 获取咨询师详情
//  * @param {String} id 咨询师ID
//  * @returns {Promise} 咨询师详情
//  */
// export function getCounselorDetail(id) {
//   return request({
//     url: `${API.counselor.detail}/${id}`,
//     method: 'GET'
//   });
// }

// /**
//  * 获取咨询师可预约时间
//  * @param {String} id 咨询师ID
//  * @param {String} date 日期，格式：YYYY-MM-DD
//  * @returns {Promise} 可预约时间段列表
//  */
// export function getCounselorAvailableTime(id, date) {
//   return request({
//     url: `${API.counselor.availableTime}/${id}`,
//     method: 'GET',
//     params: { date }
//   });
// }

// /**
//  * 获取课程列表
//  * @param {Object} params 查询参数 {keyword, category, page, pageSize, ...}
//  * @returns {Promise} 课程列表
//  */
// export function getCourseList(params) {
//   return request({
//     url: API.course.list,
//     method: 'GET',
//     params
//   });
// }

// /**
//  * 获取课程详情
//  * @param {String} id 课程ID
//  * @returns {Promise} 课程详情
//  */
// export function getCourseDetail(id) {
//   return request({
//     url: `${API.course.detail}/${id}`,
//     method: 'GET'
//   });
// }

// /**
//  * 获取我的课程
//  * @param {Object} params 查询参数 {status, page, pageSize}
//  * @returns {Promise} 我的课程列表
//  */
// export function getMyCourses(params) {
//   return request({
//     url: API.course.myCourses,
//     method: 'GET',
//     params
//   });
// }

// /**
//  * 创建订单
//  * @param {Object} data 订单数据 {type, targetId, timeSlot, ...}
//  * @returns {Promise} 创建结果
//  */
// export function createOrder(data) {
//   return request({
//     url: API.order.create,
//     method: 'POST',
//     data
//   });
// }

// /**
//  * 支付订单
//  * @param {String} orderId 订单ID
//  * @param {Object} data 支付数据 {payMethod, ...}
//  * @returns {Promise} 支付结果
//  */
// export function payOrder(orderId, data) {
//   return request({
//     url: `${API.order.pay}/${orderId}`,
//     method: 'POST',
//     data
//   });
// }

// /**
//  * 获取订单列表
//  * @param {Object} params 查询参数 {status, page, pageSize}
//  * @returns {Promise} 订单列表
//  */
// export function getOrderList(params) {
//   return request({
//     url: API.order.list,
//     method: 'GET',
//     params
//   });
// }

// /**
//  * 获取订单详情
//  * @param {String} id 订单ID
//  * @returns {Promise} 订单详情
//  */
// export function getOrderDetail(id) {
//   return request({
//     url: `${API.order.detail}/${id}`,
//     method: 'GET'
//   });
// }

// /**
//  * 示例通用请求方法
//  * @param {Object} options 请求配置，与axios类似
//  * @returns {Promise} 请求结果
//  */
// export const test = (options) => request(options);

// /**
//  * 上传文件
//  * @param {String} filePath 文件路径
//  * @param {Object} formData 额外表单数据
//  * @returns {Promise} 上传结果
//  */
// export function uploadFile(filePath, formData = {}) {
//   return request.upload(API.common.upload, filePath, 'file', formData);
// }

// /**
//  * 提交反馈
//  * @param {Object} data 反馈数据 {content, contactWay, images}
//  * @returns {Promise} 提交结果
//  */
// export function submitFeedback(data) {
//   return request({
//     url: API.common.feedback,
//     method: 'POST',
//     data
//   });
// }

// /**
//  * 用户退出登录
//  */
// export function logout() {
//   request.clearToken();
//   uni.removeStorageSync(config.storage.userInfoKey);
  
//   // 跳转到登录页
//   uni.reLaunch({
//     url: '/pages/login/index'
//   });
// }

// // 获取当前用户信息（从本地存储）
// export function getCurrentUser() {
//   return uni.getStorageSync(config.storage.userInfoKey) || null;
// }

// // 判断用户是否已登录
// export function isLoggedIn() {
//   return !!uni.getStorageSync(config.storage.tokenKey);
// }

// // 检查指定格式文件大小是否合法
// export function checkFileSize(filePath, fileType = 'image') {
//   return new Promise((resolve, reject) => {
//     uni.getFileInfo({
//       filePath,
//       success: (res) => {
//         let isValid = true;
//         let message = '';
        
//         if (fileType === 'image' && res.size > config.upload.imageMaxSize) {
//           isValid = false;
//           message = `图片大小不能超过${config.upload.imageMaxSize / 1024 / 1024}MB`;
//         } else if (fileType === 'video' && res.size > config.upload.videoMaxSize) {
//           isValid = false;
//           message = `视频大小不能超过${config.upload.videoMaxSize / 1024 / 1024}MB`;
//         } else if (fileType === 'audio' && res.size > config.upload.audioMaxSize) {
//           isValid = false;
//           message = `音频大小不能超过${config.upload.audioMaxSize / 1024 / 1024}MB`;
//         }
        
//         if (isValid) {
//           resolve(true);
//         } else {
//           uni.showToast({
//             title: message,
//             icon: 'none'
//           });
//           reject(new Error(message));
//         }
//       },
//       fail: () => {
//         reject(new Error('获取文件信息失败'));
//       }
//     });
//   });
// }

// export default {
//   login,
//   register,
//   getUserInfo,
//   updateUserInfo,
//   getCounselorList,
//   getCounselorDetail,
//   getCounselorAvailableTime,
//   getCourseList,
//   getCourseDetail,
//   getMyCourses,
//   createOrder,
//   payOrder,
//   getOrderList,
//   getOrderDetail,
//   uploadFile,
//   submitFeedback,
//   logout,
//   getCurrentUser,
//   isLoggedIn,
//   checkFileSize,
//   test
// }; 