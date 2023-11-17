/* eslint-disable @typescript-eslint/no-unused-vars */

import axios, { AxiosPromise } from "axios"
import { FoodData } from "../interface/FoodData"
const API_URL ='http://localhost:8080'
import {useMutation, useQueryClient} from "@tanstack/react-query"


const postData = async (data: FoodData): AxiosPromise<unknown> => {
    const response = axios.get(API_URL + '/food')
    return response
    }
    


export function useFoodDataMutate() {
    const queryClient = useQueryClient();
    const mutate = useMutation({
        mutationFn: postData,
        retry:2,
        onSuccess: () => {
            queryClient.invalidateQueries()
        }
    })
    return mutate
}

