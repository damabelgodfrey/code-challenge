<?php
//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
function rotLeft($arr, $noOfRotatn) {
  $size = count($arr);
  if($size == $noOfRotatn){
    return $arr;
  }
  $output = array_slice($arr, 0, $noOfRotatn);
  for ($i=0; $i < $noOfRotatn; $i++) {
    unset($arr[$i]);
  }
  $f_arr  = array_merge($arr, $output);
  return   $f_arr;
}
