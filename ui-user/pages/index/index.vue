<template>
	<!-- #ifdef MP-WEIXIN -->
	<view class="content">
		<u-button type="primary" size="small">按钮</u-button>
	</view>
	<!-- #endif -->
</template>

<script setup>
import { onLoad } from '@dcloudio/uni-app'
onLoad(()=>{
    console.log('首页')
})

</script>

<style scoped lang="scss">

</style>
