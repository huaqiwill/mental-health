<template>
    <view>
        <Tabs :TabsList="TabsList"/>
        <text>课程</text>
    </view>
</template>
<script setup>
import Tabs from '../../components/Tabs.vue';
import { onLoad } from '@dcloudio/uni-app'
import { onMounted, ref } from 'vue'
onLoad(() => {
    console.log('课程')
})
const TabsList = ref([
    { name: '关注1' },
    { name: '推荐2' },
    { name: '电影' },
    { name: '科技' },
    { name: '音乐' },
    { name: '美食' },
    { name: '文化' },
    { name: '财经' },
    { name: '手工' }
])


</script>
<style lang="scss" scoped></style>