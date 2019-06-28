<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" v-model="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" v-model="pass">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button class="btn btn-defult" @click="get">조회</button>
    <button class="btn btn-defult" @click="post">입력</button>
    <button class="btn btn-defult" @click="put">수정</button>
    <button class="btn btn-defult" @click="del">삭제</button>
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import axios from 'axios'
export default {
    data: ()=>{
        return {
            email : '',
            pass : ''
        }
    },

    components: {
      Nav, Footer
    },

    methods: {
        get: ()=>{
          axios.get('customers/hong')
          .then(d=>{
            alert(`SUCCESS : ${d.data.customerId}`)
          })
          .catch(e=>{
            alert('ERROR')
          })
        },

        post: ()=>{
          axios.post('/customers')
          .then(d=>{
            alert(`POST 연동 성공 : ${d.result}`)
          })
        },

        put: ()=>{
          axios.put('/customers/id')
          .then(d=>{
            alert(`PUT 연동 성공 : ${d.result}`)
          })
        },

        del: ()=>{
          axios.delete('/customers/id')
          .then(d=>{
            alert(`DELETE 연동 성공 : ${d.result}`)
          })
        }
    }
}
</script>

<style scoped>
</style>