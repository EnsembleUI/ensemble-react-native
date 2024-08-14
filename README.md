# Ensemble Reactive Native Wrapper

React native wrapper of ensemble package

## Installation

```sh
npm install ensemble-react-native
```

## Usage


```js
import { openEnsembleApp } from 'ensemble-react-native';

// ...

<TouchableOpacity onPress={openEnsembleApp}>
    <Text>Go to Ensemble Screen</Text>
</TouchableOpacity>
```

## Test

Install dependency: `yarn install`

[optional]
Change appId: 
- Go to `ensemble_app/ensemble/ensemble-config.yaml`
- change `appId`

Build flutter files: `cd ensemble_app && flutter build aar --no-tree-shake-icons`

Note: If their is any change in `ensemble_app` you need to re-run above build aar command

Move to main repo: `cd ..`

Run on android: `yarn example android`
