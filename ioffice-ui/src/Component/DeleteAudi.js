import React, { useEffect } from 'react'
import axios from 'axios';
import { AuditoriumList } from './AuditoriumList';
import { Navigate, useNavigate } from 'react-router';


export const DeleteAudi = (id) => {
            
    

            const url = `http://localhost:8080/admin/${id}`;
            axios.delete(url)
            .then((response)=>{
                console.log(response)}).catch((error=>console.log("error:")));
                alert("deleted successfully")

            //navigate('/AuditoriumList')
  return (
    <div></div>
  )
}