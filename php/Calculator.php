<?php
function sum($a, $b){
  return $a + $b;
}
function sub($a, $b){
  return $a - $b;
}
function mul($a, $b){
  return $a * $b;
}
function div($a, $b){
  return $a / $b;
}

function test($result, $expected){
  if($result != $expected){
    print("Test FAILS\n");
    return false;
  }
  print("Test OK\n");
  return true;
}

$testResult = true;
$testResult &= test(sum(10, 2), 12);
$testResult &= test(sub(0, 2), 2);
$testResult &= test(sub(2, 10), 8);
$testResult &= test(div(10, 2), 5);
$testResult &= test(div(10, 0), null);
$testResult &= test(mul(10, 2), 20);

if(!$testResult){
  throw new Exception("Nem todos os testes passaram.");
}
?>